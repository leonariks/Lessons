import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Абрикос");
        linkedList.add("Ананас");
        linkedList.add("Яблоко");
        linkedList.addFirst("Апельсин");
        linkedList.addLast("Груша");
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
    }
}