import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Абрикос");
        treeSet.add("Апельсин");
        treeSet.add("Яблоко");
        treeSet.add("Груша");
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.lower("Груша"));

        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(123);
        integers.add(23455);
        integers.add(1);
        integers.add(0);
        System.out.println(integers);
        System.out.println(integers.higher(1));
        integers.add(8);
        System.out.println(integers);
    }
}