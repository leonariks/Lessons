public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.setMark("Lexus");
        car.setColor("White");
        car.setMileage(52350);
        car.setNumber("ЕЕ222Е");
        car.setGas(52.5);
        car.setSeats(4);
        car.printCarInfo();

    }
}

class Car {
    private String mark;
    private String color;
    private double mileage;
    private String number;
    private double gas;
    private int seats;


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage / 1000.0;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats > 8) {
            System.out.println("Не больше восьми мест!");
        } else {
            this.seats = seats;
        }

    }

    public void printCarInfo(){
        System.out.printf(" Марка машины %s;\n Цвет %s;\n Пробег %f км;\n Номер %s;\n Осталось %f л бензина;\n Мест в машине %d.", getMark(), getColor(), getMileage(), getNumber(), getGas(), getSeats());
    }
}

