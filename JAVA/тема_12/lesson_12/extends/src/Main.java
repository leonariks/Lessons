public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("brown", "Ia", 5);
        animal.printInfo();
        Animal zubik = new Dog("black", "Zubik", 7, "Chihya");
        zubik.printInfo();
//        zubik.printDogName();
//        zubik.printDogBreed();
    }
}

class Animal {
    private String color;
    private String name;
    private int age;

    public Animal(String color, String name, int age) {
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println(name + " " + color + " " + age);
    }
}


class Dog extends Animal {

    private String breed;

    Dog(String color, String name, int age, String breed) {
        super(color, name, age);
        this.breed = breed;
    }

    public void printDogName(){
        System.out.println(getName());
    }

    public void printDogBreed(){
        System.out.println(breed);
    }

    @Override
    public void printInfo() {
        //super.printInfo();
        System.out.println(getName()+ " " + getColor() + " " + getAge() + " " + breed);
    }
}