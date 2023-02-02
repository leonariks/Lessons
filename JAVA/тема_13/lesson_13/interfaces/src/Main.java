public class Main {
    public static void main(String[] args) {
        // Printer printer = new Printer();

        Printer barsik = new Cat("Barsik", "Kyrbob");
        barsik.print();
        barsik.printMessage();
        Printer tuzik = new Dog("Tuzik");
        tuzik.print();
        tuzik.printMessage();
        Printer.printPrinter();
    }
}


interface Printer {

    void print();
    default void printMessage(){
        System.out.println("My message");
    }
    static void printPrinter(){
        System.out.println("Printer");
    }
}

class Cat implements Printer {
    String name;
    String breed;

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void print() {
        System.out.println(name + " " + breed);
    }

    @Override
    public void printMessage() {
        System.out.println("Cats message");
    }
}

class Dog implements Printer {

    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}