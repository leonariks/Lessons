import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cat cat = new Cat();
//        cat.age = 1;
//        cat.name = "Джемик";
//        cat.breed = "Курильский бобтейл";
//        cat.weight = 4.1;
        cat.printCatInfo();

        Cat djemik = new Cat("Джемик",1);
        djemik.printCatInfo();
        Cat barsik = new Cat("Джемик", "Курбобик", 1, 4.1);
        barsik.printCatInfo();
        //System.out.println("Имя : " + cat.name + "\n" + "Возраст : " + cat.age);
    }
}