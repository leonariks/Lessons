import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            String[] cats = {"Barsik", "Sema"};
            cats[4] = "Djemik";
            System.out.println(cats[1]);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Finally");
        }
        System.out.println("End");

        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        try{
            if(age < 0){
                throw new Exception("Возраст должен быть больше нуля!");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}