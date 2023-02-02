public class Main {
    public static void main(String[] args) {
        Animal tuzik = new Dog("Тузик", "Черный");
        ((Dog)tuzik).setColor("Серый");
        tuzik.print();
        Animal dora = new Turtle("Дора", true);
        if(dora instanceof Dog){
            ((Turtle)dora).setLikesWater(false);
        }else{
            System.out.println("Не могу преобразовывать!");
        }
        dora.print();
        Animal tom = new Animal("Том");
        tom.print();

        Object myDog = new Dog("БакБак", "Рыжий");

        if (myDog instanceof Turtle dog){
            dog.setLikesWater(false);
            dog.print();
        }

        Dog dog = (Dog)myDog;
        dog.setColor("Коричневый");
        dog.print();
//        System.out.println(dora.toString());
//        String a = dora.toString();
//        System.out.println(a);
    }
}