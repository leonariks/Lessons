public class Main {
    public static void main(String[] args) {

        Transport auto = new Transport("Автомобиль");
        System.out.println(auto.getName());
        changeName(auto);
        System.out.println(auto.getName());
        int b = 12;
        myMethod(b);
        System.out.println(b);

        changeTransport(auto);
        System.out.println(auto.getName());
    }

    static void changeName(Transport transport) {
        transport.setName("Белаз");
    }

    static void changeTransport(Transport transport){
        transport = new Transport("Автобус");
        System.out.println(transport.getName());
    }
    static void myMethod(int a) {

        a = 45;
    }
}

class Transport {
    private String name;

    public Transport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}