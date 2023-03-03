import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static  List<User> users;
    static  List<Product> products;
    public static boolean[] login(String loginOrEmail, String password){
        for(User u: users){
            if (u.equals(new User(loginOrEmail, loginOrEmail, password))){
                return new boolean[]{true, u.isAdmin()};
            }
        }
        return new boolean[]{false};
    }
    public static void registration(Scanner scanner){

        String name, patronymic, surname, phoneNumber, login, email, password;

        while(true){
            System.out.println("Имя:");
            name = scanner.next();
            if (!name.matches("^[A-Za-zА-Яа-я]*$")){
                System.out.println("Некорректно. Повторите");
            } else {
                break;
            }
        }
        while(true){
            System.out.println("Отчество:");
            patronymic = scanner.next();

            if (!patronymic.matches("^[A-Za-zА-Яа-я]*$")){
                System.out.println("Некорректно. Повторите");
            } else {
                break;
            }
        }
        while(true){
            System.out.println("Фамилия:");
            surname = scanner.next();
            if (!surname.matches("^[A-Za-zА-Яа-я]*$")){
                System.out.println("Некорректно. Повторите");
            } else {
                break;
            }
        }
        while(true) {
            System.out.println("Номер телефона:");
            phoneNumber = scanner.next();
            if (!phoneNumber.matches("(\\+7|7|8)+(\\d{10})")){
                System.out.println("Некорректно. Повторите");
            } else {
                break;
            }
        }
        System.out.println("Логин:");
        login = scanner.next();
        while(true) {
            System.out.println("Email:");
            email = scanner.next();
            if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")){
                System.out.println("Некорректно. Повторите");
            } else {
                break;
            }
        }
        System.out.println("Пароль:");
        password = scanner.next();
        User newUser= new User(name, patronymic, surname, phoneNumber, login, email, password);
        users.add(newUser);
        System.out.println(newUser);
    }
    public static void changeRole(Scanner scanner){
        showUsersInfo();
        System.out.println();
        System.out.println("Введите номер пользователя в списке");
        int userNumber = scanner.nextInt();
        User user = users.get(userNumber);
        user.setAdmin(!user.isAdmin());
        System.out.println("Роль пользователя изменена");
        System.out.println(user);
        System.out.println();
    }

    public static void showUsersInfo(){
        for(User u: users){
            System.out.println(users.indexOf(u) + " : " + u);
        }
        System.out.println();
    }
    public static boolean isNumeric(String str) {
        return str.matches("\\d+(\\.\\d+)?");
    }

    public static void showProductsList(){
        for(Product p: products){
            System.out.println(products.indexOf(p) + " : " + p);
        }
    }
    public static void addOrRemoveProduct(Scanner scanner){
        boolean active = true;
        while(active) {
            System.out.println("1 - Добавить товар");
            System.out.println("2 - Удалить товар");
            System.out.println("3 - Просмотреть список товаров");
            System.out.println("0 - Назад");
            int menuItem = scanner.nextInt();
            switch (menuItem){
                case 1: {
                    String productName, price;
                    System.out.println("Введите наименование товара");
                    productName = scanner.next();
                    while(true){
                        System.out.println("Введите цену товара");
                        price = scanner.next();
                        if (!isNumeric(price)){
                            System.out.println("Некорректно. Повторите");
                        } else {
                            break;
                        }
                    }
                    Product product = new Product(
                            productName,
                            Long.parseLong(price));
                    products.add(product);
                    break;
                }
                case 2: {
                    showProductsList();
                    System.out.println();
                    if (!products.isEmpty()) {
                        System.out.println("Введите номер товара в списке");
                        int productNumber = scanner.nextInt();
                        Product product = products.get(productNumber);
                        products.remove(product);
                        System.out.println("Товар удалён");
                    } else {
                        System.out.println("Список товаров пуст");
                    }
                    break;
                }
                case 3: {
                    showProductsList();
                    break;
                }
                case 0: {
                    active = false;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        users = new ArrayList<User>();
        products = new ArrayList<Product>();
        users.add(new User("a", "a", "a", "123", "admin",
                "admin@admin.ru", "1", true));
        users.add(new User("u", "u", "u", "123", "user",
                "user@user.ru", "1", false));

        Scanner scanner = new Scanner(System.in);
        boolean active = true;

        while(active) {
            System.out.println("1 - Вход");
            System.out.println("2 - Регистрация");
            System.out.println("0 - Завершение работы");
            int menuItem = scanner.nextInt();
            switch (menuItem) {
                case 1: {
                    while (true) {
                        System.out.println("Логин/email:");
                        String loginOrEmail = scanner.next();

                        System.out.println("Пароль:");
                        String password = scanner.next();
                        boolean[] result = login(loginOrEmail, password);
                        if (result[0]) {
                            System.out.println("Добро пожаловать!");
                            if (result[1]){
                                System.out.println("Вы админ.");
                                boolean adminActivity = true;
                                while(adminActivity) {
                                    System.out.println("1 - Добавить/удалить товар");
                                    System.out.println("2 - Просмотреть информацию о пользователях");
                                    System.out.println("3 - Сменить роль пользователя");
                                    System.out.println("0 - Назад");
                                    menuItem = scanner.nextInt();
                                    switch (menuItem){
                                        case 1:{
                                            addOrRemoveProduct(scanner);
                                            break;
                                        }
                                        case 2:{
                                            showUsersInfo();
                                            break;
                                        }
                                        case 3:{
                                            changeRole(scanner);
                                            break;
                                        }
                                        case 0: {
                                            adminActivity = false;
                                            break;
                                        }
                                        default: {
                                            System.out.println("Нет такого пункта, повторите ввод");
                                            System.out.println();
                                        }
                                    }
                                }
                            } else {
                                System.out.println("Вы не админ.");
                                boolean userActivity = true;
                                while(userActivity) {
                                    System.out.println("1 - Просмотреть список товаров");
                                    System.out.println("0 - Назад");
                                    menuItem = scanner.nextInt();
                                    switch (menuItem) {
                                        case 1: {
                                            showProductsList();
                                            break;
                                        }
                                        case 0: {
                                            userActivity = false;
                                            break;
                                        }
                                        default: {
                                            System.out.println("Нет такого пункта, повторите ввод");
                                            System.out.println();
                                        }
                                    }
                                }
                            }
                            break;
                        } else {
                            System.out.println("Неверные данные, повторите ввод");
                        }
                    }
                    break;
                }
                case 2: {
                    registration(scanner);
                    break;
                }
                case 0: {
                    active = false;
                    break;
                }
                default: {
                    System.out.println("Нет такого пункта, повторите ввод");
                    System.out.println();
                }
            }
        }
    }
}