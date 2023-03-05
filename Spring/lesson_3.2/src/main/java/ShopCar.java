public class ShopCar {
    private Car car;

    public ShopCar(Car car) {
        this.car = car;
    }

    public void SaleCar(){
        System.out.println("В данный момент в магазине продаётся: " + car.getName() + ". " + car.accelerate() + ". " + car.brake());
    }
}
