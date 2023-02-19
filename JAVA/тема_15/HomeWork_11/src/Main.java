import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
       TreeSet<Integer> collection = new TreeSet<>();
        System.out.println("Введите значения:");
       Scanner in = new Scanner(System.in);
       while(true){
           if(!collection.add(in.nextInt())){
               for(Integer value:collection){
                   System.out.println(value);
               }
               System.out.println(collection.size());
               System.out.println("Введите число для удаления");
               if (collection.remove(in.nextInt())){
                   for(Integer value:collection){
                       System.out.println(value);
                   }
               }else {
                   System.out.println("Удаление нее было завершено");
               }
               return;
           }
       }
    }
}