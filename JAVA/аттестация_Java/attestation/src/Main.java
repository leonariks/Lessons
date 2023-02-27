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
            User user = new User();
            User admin = new User();
            admin.setLogin("admin");
            admin.setPass("pass");
            System.out.println("1 - Регистрация\n2 - Авторизация");
            int input = in.nextInt();
            in.nextLine();
            switch (input) {
                case 1:

                    boolean nonunic;
                    do {
                        nonunic = false;
                        System.out.println("Login:");
                        user.setLogin(in.nextLine());
                        for (User us : users) {
                            if (us.equals(user)) {
                                nonunic = true;
                                System.out.println("Логин занят!");
                            }
                        }
                    } while (nonunic);
                    System.out.println("Password:");
                    user.setPass(in.nextLine());
                    System.out.println("First Name:");
                    user.setFirstName(in.nextLine());
                    System.out.println("Second Name:");
                    user.setSecondName(in.nextLine());
                    System.out.println("Surname:");
                    user.setSurname(in.nextLine());
                    do {
                        nonunic = false;
                        System.out.println("Telephone:");
                        while (!user.setTel(in.nextLine())) ;
                        for (User us : users) {
                            if (us.equals(user)) {
                                nonunic = true;
                                System.out.println("Телефон занят!");
                            }
                        }
                    } while (nonunic);
                    do {
                        nonunic = false;
                        System.out.println("Email:");
                        while (!user.setEmail(in.nextLine())) ;
                        for (User us : users) {
                            if (us.equals(user)) {
                                nonunic = true;
                                System.out.println("Email занят!");
                            }
                        }
                    } while (nonunic);
                    users.add(user);
                    System.out.println("Аккаунт успешно зарегистрирован!");
                    break;

                case 2:

                    System.out.println("Login:");
                    user.setLogin(in.nextLine());
                    System.out.println("Password:");
                    user.setPass(in.nextLine());
                    if (user.getLogin().equals(admin.getLogin()) && user.getPass().equals(admin.getPass())) {
                        System.out.println("Вы авторизованы в роли администратора!");
                    } else if (!findUser(user.getLogin(), user.getPass(), users)) {
                        System.out.println("Неккоректный Логин/Пароль.");
                    }
                    break;

                default:
                    System.out.println("Non");
            }
        }
    }

    static boolean findUser(String login, String pass, ArrayList<User> users) {
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPass().equals(pass)) {
                System.out.println("Вы авторизованы!");
                return true;
            }
        }
        return false;
    }

}