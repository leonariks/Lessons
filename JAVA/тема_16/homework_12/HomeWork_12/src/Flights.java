import java.util.Objects;

public class Flights {
    private String id;
    private String airport;
    private String company;
    private String pointB;
    private String time;
    private double price;

    public String getId() {
        return id;
    }

    public boolean setId(String id) {
        if (id.matches("[A-ZА-Я]{2}\\d{4}")) {
            this.id = id;
            return true;
        } else {
            System.out.println("Введите корректные данные!");
            return false;
        }
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPointB() {
        return pointB;
    }

    public void setPointB(String pointB) {
        this.pointB = pointB;
    }

    public String getTime() {
        return time;
    }

    public boolean setTime(String time) {
        if (time.matches("(0|1|2)\\d:[0-5]\\d")) {
            this.time = time;
            return true;
        } else {
            System.out.println("Введите корректные значения!");
            return false;
        }
    }

        public double getPrice () {
            return price;
        }

        public void setPrice ( double price){
            this.price = price;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flights flights = (Flights) o;

        return Objects.equals(id, flights.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return getId() + " " + getAirport() + " " + getTime() + " " + getCompany() + " " + getPointB() + " " + getPrice();
    }
}
