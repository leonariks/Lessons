import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Яблоко");
        fruits.add("Мандарин");
        fruits.add("Апельсин");
        System.out.println(fruits);
        fruits.add(0, "Абрикос");
        System.out.println(fruits);
        System.out.println(fruits.size());
        for (String element : fruits) {
            System.out.println(element);
        }
        if (fruits.contains("Апельсин")){
            System.out.println("Апельсин найден");
        }
        fruits.remove("Яблоко");
        fruits.remove(0);
        System.out.println(fruits);
    }
}