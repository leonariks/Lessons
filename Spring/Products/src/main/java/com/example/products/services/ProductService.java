package com.example.products.services;

import com.example.products.models.Product;
import com.example.products.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class ProductService {


    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //Метод получает список всех продуктов
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    //Метод получает продукт по id
    public Product getProductId(int id){
        Optional<Product> product = productRepository.findById(id);
        return product.orElse(null);
    }

    //Метод добавляет новый продукт
    @Transactional
    public void newProduct(Product product){
        productRepository.save(product);
    }

    //Метод изменяет продукт
    @Transactional
    public void editProduct(int id, Product product){
        product.setId(id);
        productRepository.save(product);
    }

    //Метод удаляет продукт
    @Transactional
    public void delete(int id){
        productRepository.deleteById(id);
    }
}
