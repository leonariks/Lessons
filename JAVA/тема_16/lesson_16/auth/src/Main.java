import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        auth();
    }

    public void auth() {
        Scanner in = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        while (true) {
            System.out.println("Введите 1 для регистрации\n2 для авторизации\n0 для выхода");
            int inputMenu = in.nextInt();
            in.nextLine();
            switch (inputMenu) {
                case 1:
                    System.out.println("Регистрация");
                    System.out.println("Введите логин: ");
                    String login = in.nextLine();
                    System.out.println("Введите пароль: ");
                    String pass = in.nextLine();
                    users.add(new User(login, pass));
                    System.out.println("Пользователь добавлен");
                    break;

                case 2:
                    System.out.println("Авторизация");
                    System.out.println("Введите логин: ");
                    String loginAuth = in.nextLine();
                    System.out.println("Введите пароль: ");
                    String passAuth = in.nextLine();
                    User user = new User(loginAuth, passAuth);
                    for (User item:users){
                        System.out.println(user.equals(item));
                    }
//                    if (!findUser(loginAuth, passAuth, users)) {
//                        System.out.println("Данные не корректны!");
//                    }
                    break;

                case 0:
                    return;
            }
        }

    }

    static boolean findUser(String login, String pass, ArrayList<User> users) {
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPass().equals(pass)) {
                System.out.println("Вы авторизованы");
                return true;
            }

        }
        return false;
    }
}