import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Flights> flight = new ArrayList<>();
        while (true) {
            System.out.println("1) Добавление нового рейса\n2) Вывод всех рейсов\n3) Вывод всех рейсов");
            switch (in.nextLine()) {
                case "1":
                    Flights flights = new Flights();
                    boolean nonunic;
                    do {
                        nonunic = false;
                        System.out.println("Введите номер рейса");
                        while (!flights.setId(in.nextLine())) ;
                        for (Flights fl : flight) {
                            if (fl.equals(flights)) {
                                nonunic = true;
                            }
                        }

                    } while (nonunic);
                    System.out.println("Введите наименование аэропорта");
                    flights.setAirport(in.nextLine());
                    System.out.println("Введите название авиакомпании");
                    flights.setCompany(in.nextLine());
                    System.out.println("Введите пункт назначения");
                    flights.setPointB(in.nextLine());
                    System.out.println("Введите время вылета");
                    while (!flights.setTime(in.nextLine())) ;
                    System.out.println("Введите стоимость билета");
                    flights.setPrice(in.nextDouble());
                    in.nextLine();
                    System.out.println("1) Подтвердить добавление нового рейса\n2) Отменить добавление нового рейса");
                    boolean stop;
                    do {
                        stop = false;
                        switch (in.nextLine()) {
                            case "1":
                                flight.add(flights);

                                break;

                            case "2":

                                break;
                            default:stop = true;
                        }
                    } while (stop);

                    break;

                case "2":
                    for (Flights fl : flight) {
                        System.out.println(fl);
                    }
                    break;

                case "3":

                    return;
            }
        }
    }
}