package com.example.products.models;

import com.example.products.enumm.Provider;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Product {

    private int id;

    @NotEmpty(message="Наименование не может быть пустым!")
    @Size(min = 1, max = 25, message = "Наименование должна быть в диапазоне от 1 до 20 символов!")
    private String name;

    @NotNull(message="Цена не может быть пустой!")
    @Min(value = 1, message = "Цена не может быть ниже 0!")
    private float price;

    @NotEmpty(message="Вес не может быть пустым!")
    @Min(value = 1, message = "Вес не может быть ниже 0!")
    private String weight;

    private Provider provider;

    public Product(int id, String name, float price, String weight, Provider provider) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.provider = provider;
    }

    public Product(Product product) {
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }
}
