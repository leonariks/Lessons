import arifm.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        MyClass myClass = new MyClass(123);
//
//        Arifmetics arifmetics = new Arifmetics();
//        arifmetics.a = 10;
//        arifmetics.b = 20;
//        arifmetics.sum();

        Arifmetics.min(20,10);

        System.out.println(Arifmetics.PI);

        Cat.id = 12;
        System.out.println(Cat.id);
        Cat djemik = new Cat("Джемик", "Разноцветный", 2, "Курбобик");
        Cat sema = new Cat("Джемик", "Разноцветный", 2, "Курбобик");

        System.out.println(Cat.id);

        djemik.setName("Djem");
        String color = djemik.getColor();
        System.out.println(djemik.getBreed());

        //       djemik.printAge();
//        djemik.printBreed();
//        djemik.printColor();
//        djemik.printName();

//        System.out.println(djemik.name);
//        System.out.println(djemik.age);
//        System.out.println(djemik.breed);
        //  System.out.println(djemik.color);
    }
}


class Cat {

    public static int id = 0;
    private String name;
    private String color;
    private int age;
    private String breed;

    static {
        System.out.println("Static init");
    }


    public Cat(String name, String color, int age, String breed) {

        setName(name);
        setAge(age);
        setBreed(breed);
        setColor(color);
        id++;
//        this.name = name;
//        this.age = age;
//        this.breed = breed;
//        this.color = color;
        //printAge();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        if (age > 0) {
            this.age = age;
        }
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    //    public void printName() {
//        System.out.println(name);
//    }
//
//    protected void printColor() {
//        System.out.println(color);
//    }
//
//    private void printAge() {
//        System.out.println(age);
//    }
//
//    void printBreed() {
//        System.out.println(breed);
//    }
}