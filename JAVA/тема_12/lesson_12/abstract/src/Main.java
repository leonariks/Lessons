public class Main {
    public static void main(String[] args) {
        Cat myAnimal = new Cat("Джемик");
        myAnimal.printInfo();
    }
}

abstract class Animal{
    private String name;

    public abstract void printInfo();

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cat extends Animal{
    Cat(String name){
        super(name);
    }

    @Override
    public void printInfo() {
        System.out.println(getName());
    }
}