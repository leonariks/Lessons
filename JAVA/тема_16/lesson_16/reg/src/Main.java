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
        if (string.matches("\\d+")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}