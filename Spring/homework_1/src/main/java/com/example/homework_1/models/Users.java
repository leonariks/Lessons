package com.example.homework_1.models;

import jakarta.validation.constraints.*;

public class Users {

    private int id;

    @NotEmpty(message="Фамилия не может быть пустой!")
    @Size(min = 1, max = 25, message = "Фамилия должна быть в диапазоне от 1 до 20 символов!!")
    private String second_name;

    @NotEmpty(message="Имя не может быть пустой!")
    @Size(min = 1, max = 25, message = "Имя должна быть в диапазоне от 1 до 20 символов!")
    private String first_name;
    private String surname;

    @Min(value = 18, message = "Возраст не может быть ниже 18 лет!")
    private int age;

    @NotEmpty(message = "Email пользователя нге может быть пустым!")
    @Email(message = "Вы ввели неверный email!")
    private String email;

    @NotEmpty(message = "Номер телефона не может быть пустым!")
    @Pattern(regexp = "^((\\+7|7|8)+([0-9]){10})$", message = "Вы ввели неверный номер телефона")
    private String telephone;

    public Users(String second_name, String first_name, String surname, int age, String email, String telephone) {
        this.id=id;
        this.second_name = second_name;
        this.first_name = first_name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.telephone = telephone;
    }

    public Users(Users users){

    }

    public Users() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
