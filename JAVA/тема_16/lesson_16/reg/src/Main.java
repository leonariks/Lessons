import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String login = "admin";
//        String pass = "pass";
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите логин: ");
//        String loginIn = in.nextLine();
//        System.out.println("Введите пароль: ");
//        String passIn = in.nextLine();
//
//        if (loginIn.matches(login) && passIn.matches(pass)) {
//            System.out.println("Вы вошлши в систему!");
//        } else {
//            System.out.println("Неверный логин/пароль!");
//        }

        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        if (string.matches("(!|@|-|\\*)?\\d*")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(string.matches("[a-zA-Zа-яА-Я6789]"));
        System.out.println(string.matches("[^а-д]{3,6}"));
        System.out.println(string.matches("\\d{3,6}"));
        System.out.println(string.matches("(\\+7|7|8)+(\\d{10})"));
    }
}