public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cat cat = new Cat();
        cat.age = 1;
        cat.name = "Джемик";
        cat.breed ="Курильский бобтейл";
        cat.weight = 4.1;
        cat.printCatInfo();
        //System.out.println("Имя : " + cat.name + "\n" + "Возраст : " + cat.age);
    }
}