import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Абрикос");
        hashSet.add("Яблоко");
        hashSet.add("Ананас");

        hashSet.add("Абрикос");
        System.out.println(hashSet);
    }
}