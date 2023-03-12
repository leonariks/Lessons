package com.example.products.controllers;

import com.example.products.dao.DaoProduct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Product {
    private final DaoProduct daoProduct;

    public Product(DaoProduct daoProduct) {
        this.daoProduct = daoProduct;
    }


    //Метод позволяет получить get параметры и добавить товар в ArrayList из DAO класса
    // ?name=Хлеб&price=50&weight=300&provider=LadyLux
    // ?name=Молоко&price=100&weight=1000&provider=OBi
//    @GetMapping("/product/add")
//    public void addProduct(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "price", required = false) float price, @RequestParam(value = "weight", required = false) String weight, @RequestParam(value = "provider", required = false) Provider provider) {
//        daoProduct.addProduct(name, price, weight, provider);
//    }


    // Метод позволяет получить список всех продуктов и вернуть html страницу
    @GetMapping("/product")
    public String index(Model model) {
        model.addAttribute("product", daoProduct.getProducts());
        return "product";
    }

    //Метод позволяет получить объект из листа по id
    @GetMapping("/product/{id}")
    public String infoProduct(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", daoProduct.getProductId(id));
        return "product_info";
    }

    //Метод позволяет отобразить форму представления с формой добавления
    @GetMapping("/product/add")
    public String newProduct(Model model) {
        model.addAttribute("product", new com.example.products.models.Product());
        return "add_product";
    }

    //Метод позволяет принять данные с формы и сохранить товар в лист
    @PostMapping("/product/add")
    public String newProduct(@ModelAttribute("product") com.example.products.models.Product product) {
        daoProduct.addProduct(product);
        return "redirect:/product";
    }

    //Метод позволяет получить изменяемый продукт по id и вернуть форму редактирования продукта
    @GetMapping("/product/edit/{id}")
    public String editProduct(@PathVariable("id") int id, Model model) {
        model.addAttribute("edit_product", daoProduct.getProductId(id));
        return "edit_product";
    }

    //Метод позволяет принять редакутируемый объект с формы и обновить информацию о нём
    @PostMapping("/product/edit/{id}")
    public String edit_Product(@ModelAttribute("edit_product") com.example.products.models.Product product, @PathVariable("id") int id) {
        daoProduct.updatePerson(id, product);
        return "redirect:/product";
    }

    @GetMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable("id") int id){
        daoProduct.deleteProduct(id);
        return "redirect:/product";
    }
}
