package com.example.products.dao;

import com.example.products.enumm.Provider;
import com.example.products.models.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DaoProduct {
    private int id;
    private List<Product> products = new ArrayList<>();

    //Метод позволяет создать объект класса и добавить его в ArrayList
//    public void addProduct(String name, float price, String weight, Provider provider) {


    //Метод позволяет добавить объект в лист
    public void addProduct(Product product){
        products.add(product);
        product.setId(++id);
    }

    //Метод позволяет получить все товары из ArrayList
    public List<Product> getProducts() {
        return products;
    }

    //Метод позволяет получить объект из листа
    public Product getProductId(int id) {
//        for (Product pr : products){
//            if (pr.getId() == id){
//                return pr;
//            }
//        }
//        return null;
        return products.stream().filter(product -> product.getId() == id).findAny().orElse(null);
    }


    // Метод позволяет найти товар по id и заменить его значения
    public void updatePerson(int id, Product product){
        Product productUpdate = getProductId(id); // получаем редактируемый объект по его id
        productUpdate.setName(product.getName());
        productUpdate.setPrice(product.getPrice());
        productUpdate.setWeight(product.getWeight());
        productUpdate.setProvider(product.getProvider());
    }


    //Метод позволяет удалить товар
    public void deleteProduct(int id){
        products.removeIf(product -> product.getId()==id);
    }
}
