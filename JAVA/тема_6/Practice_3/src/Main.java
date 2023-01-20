
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число: ");

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();


        if (input % 2 == 0) {

            System.out.println("Число четное");
        } else {

            System.out.println("Число не четное");
        }

        System.out.println("Введите день недели");


        String day = in.next();
        switch (day) {

            case "Понедельник":
            case "Вторник":
            case "Среда":
            case "Четверг":
            case "Пятница":
                System.out.println(day + "- рабочий день!");
            break;
            default:
                System.out.println(day + "- выходной день!");
            break;
        }
    }
}