import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        auth();
    }


    public static void auth() {

        Scanner in = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        while (true) {
            System.out.println("Введите:\n1 - авторизоваться\n2 - зарегистрироваться");
            int inputMenu = in.nextInt();
            in.nextLine();
            switch (inputMenu) {
                case 1:
                    System.out.println("Авторизация");
                    System.out.println("Введите логин:");
                    String loginAuth = in.nextLine();
                    System.out.println("Введите пароль:");
                    String pasAuth = in.nextLine();

                    if (!findUser(loginAuth, pasAuth, users)){
                        System.out.println("Вы ввели некорректные данные!");
                    }

                    break;

                case 2:
                    System.out.println("Регистрация");
                    System.out.println("Введите логин:");
                    String login = in.nextLine();
                    System.out.println("Введите пароль:");
                    String pas = in.nextLine();
                    System.out.println("Введите имя:");
                    String firstName = in.nextLine();
                    System.out.println("Введите Фамилию:");
                    String secondName = in.nextLine();
                    System.out.println("Введите Отчество:");
                    String surname = in.nextLine();
                    System.out.println("Введите номер телефона:");
                    String telephone = in.nextLine();
                    System.out.println("Введите email:");
                    String email = in.nextLine();
                    users.add(new User(login, pas, firstName, secondName, surname, telephone, email));
                    System.out.println("Вы зарегистрированы");
                    break;
                default:
                    System.out.println("Выберите действие!");
            }
        }
    }

    static boolean findUser(String login, String pas, ArrayList<User> users) {
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPas().equals(pas)) {
                System.out.println("Вы авторизованы!");
                return true;
            }
        }
        return false;
    }

}