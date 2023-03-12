package Beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

//        Jeep jeep_one = context.getBean("jeep", Jeep.class);
//
//        Jeep jeep_two = context.getBean("jeep", Jeep.class);
//        System.out.println(jeep_one);
//        System.out.println(jeep_two);

        Hatchback hatchback_one = context.getBean("hatchback", Hatchback.class);
        Hatchback hatchback_two = context.getBean("hatchback", Hatchback.class);
        System.out.println(hatchback_one);
        System.out.println(hatchback_two);

        context.close();
//        System.out.println("Выберите машину, которую хотите продавать в вашем магазине:\n1 - внедорожник\n2 - хетчбэк");
//        ShopCar shopCar = context.getBean("shopCar", ShopCar.class);
//        System.out.println(shopCar.getAdress());
//        System.out.println(shopCar.getNumber_of_employees());
////        shopCar.SaleCar();
//        context.close();

//        Scanner in = new Scanner(System.in);
//        int operation = in.nextInt();
//        switch (operation) {
//            case 1: {
//
//                Car car = context.getBean("jeep", Car.class);
//                ShopCar shopCar = new ShopCar(car);
//                shopCar.SaleCar();
//                break;
//            }
//            case 2: {
//
//                Car car = context.getBean("hatchback", Car.class);
//                ShopCar shopCar = new ShopCar(car);
//                shopCar.SaleCar();
//                break;
//            }
//        }
//        context.close();
    }
}
