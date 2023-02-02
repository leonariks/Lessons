public class Main {
    public static void main(String[] args) {
        LetsCompare compare1 = new LetsCompare();
        System.out.println(compare1.compare("pop", "it"));
        System.out.println(compare1.compare("pop", "it", "simple"));
        compare1.printInfo(Door.LOCK);
        double i = Compare.PI;
        OneDoor myDoor = new OneDoor();
        myDoor.printInfo(Door.LOCK);
    }
}

class LetsCompare implements Compare, Door {
    @Override
    public void printInfo(int state) {
        System.out.println(state);
    }
}

interface Compare extends Door{

    double PI = 3.14;

    default String compare(String a, String b) {

        return compareAll(a, b);
    }

    default String compare(String a, String b, String c) {
        return compareAll(a, b, c);
    }

    private String compareAll(String... values) {
        String result = "";
        for (String a : values) {
            result = result + a + " ";
        }
        return result;
    }
}

class OneDoor implements Door{

    @Override
    public void printInfo(int state) {
        switch (state){
            case LOCK :
                System.out.println("Дверь закрыта");
                break;
            case UNLOCK:
                System.out.println("Дверь открыта");
                break;
            default:
                System.out.println("Нет информации");
                break;
        }
    }
}
interface Door{
    int LOCK = 1;
    int UNLOCK = 2;

    void printInfo(int state);
}