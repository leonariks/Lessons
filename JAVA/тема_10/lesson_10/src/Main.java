import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Cat cat = new Cat();
////        cat.age = 1;
////        cat.name = "Джемик";
////        cat.breed = "Курильский бобтейл";
////        cat.weight = 4.1;
//        cat.printCatInfo();
//
//        Cat djemik = new Cat("Джемик",1);
//        djemik.printCatInfo();
//        Cat barsik = new Cat("Джемик", "Курбобик", 1, 4.1);
//        barsik.printCatInfo();
//        //System.out.println("Имя : " + cat.name + "\n" + "Возраст : " + cat.age);

        Tiles tiles = new Tiles();
        tiles.brand = "Cersanit";
        tiles.size_w = 33.5;
        tiles.size_h = 43.5;
        tiles.price = 1000;
        tiles.getData();

        Tiles est = new Tiles("Estima", 45, 45, 1500);
        est.getData();

        Tiles vi = new Tiles("Vitra", 1100.5);
        vi.getData();
    }
}