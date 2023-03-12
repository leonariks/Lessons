package Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component

public class ShopCar {
//    @Autowired
//    private Jeep jeep;
//    private String city;
//
//    public Car getCar() {
//        return car;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//

//    public ShopCar(Jeep jeep) {
//        this.jeep = jeep;
//    }
//
//    private Jeep jeep;
//    private Hatchback hatchback;
//    @Autowired
//    public void ShopCar(Jeep jeep, Hatchback hatchback) {
//        this.jeep = jeep;
//        this.hatchback = hatchback;
//    }
//
//    public void SaleCar() {
//        System.out.println("В данный момент в магазине продаётся: " + jeep.getName() + ". " + jeep.accelerate() + ". " + jeep.brake());
//        System.out.println("В данный момент в магазине продаётся: " + hatchback.getName() + ". " + hatchback.accelerate() + ". " + hatchback.brake());
//    }
//    @Autowired
//    @Qualifier("jeep")
//    private Jeep jeep;
//
//    @Autowired
//    @Qualifier("hatchback")
//    private Hatchback hatchback;
//    @Autowired
//    public void ShopCar(@Qualifier("jeep") Jeep jeep,@Qualifier("hatchback") Hatchback hatchback) {
//        this.jeep = jeep;
//        this.hatchback = hatchback;
//
//        public void SaleCar() {
//        System.out.println("В данный момент в магазине продаётся: " + jeep.getName() + ". " + jeep.accelerate() + ". " + jeep.brake());
//        System.out.println("В данный момент в магазине продаётся: " + hatchback.getName() + ". " + hatchback.accelerate() + ". " + hatchback.brake());
//
//        }

    private Car car;

    @Value("${shopCar.adress}")
    private String adress;

    @Value("${shopCar.number_of_employees}")
    private  int number_of_employees;

    public String getAdress() {
        return adress;
    }

    public int getNumber_of_employees() {
        return number_of_employees;
    }
}
