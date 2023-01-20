public class Cat {
    String name;
    String breed;
    int age;
    double weight;

    {
        name = "Kilimangaro";
        breed = "Amogus";
        printCatInfo();
        System.out.printf("Lol");
    }
    Cat(String n, int a) {
        name = n;
        age = a;
        breed = "неизвестно";
        weight = 0;
    }

    Cat(){

    }
    Cat(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    void printCatInfo() {
        String name;
        name = "Oppok";
        System.out.printf("Имя кота: %s, порода: %s, возраст: %d, вес: %f \n", this.name, breed, age, weight);
    }
}
