public class Printer {
    public <T> void printInfo(T[] items){
        for (T item:items){
            System.out.println(item);
        }
    }
}
