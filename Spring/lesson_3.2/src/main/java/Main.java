import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println("Выберите машину, которую хотите продавать в вашем магазине:\n1 - внедорожник\n2 - хетчбэк");
        Scanner in = new Scanner(System.in);
        int operation = in.nextInt();
        switch (operation){
            case 1:{
                Car car = context.getBean("JeepBean", Car.class);
                ShopCar shopCar = new ShopCar(car);
                shopCar.SaleCar();
                break;
            }
            case 2:{
                Car car = context.getBean("HatchbackBean", Car.class);
                ShopCar shopCar = new ShopCar(car);
                shopCar.SaleCar();
                break;
            }
        }
        context.close();
    }
}
