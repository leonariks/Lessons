public class Main {
    public static void main(String[] args) {

        Order<Integer,Integer> order1 = new Order<Integer,Integer>(12, "Popkina 12", 1212);
        int order1Id = order1.getId();
        int order1Pr = order1.getPrice();
        Order<String,Double> order2 = new Order<>("Pipi and pupi kakala", "Pipkina 13", 1313.13);
        String order2Id = order2.getId();
        double order2Pr = order2.getPrice();

        System.out.println(order1Id + " " + order1Pr);
        System.out.println(order2Id + " " + order2Pr);

        MyClass[] myClasses = {new MyClass(), new MyClass()};
        String[] cats = {"Djemik","Barsik","Artemii"};
        Integer[] ints = {12, 55, 78, 81};
        Printer printer = new Printer();
        printer.printInfo(cats);
        printer.printInfo(ints);
        printer.printInfo(myClasses);

        MyClass myClass = new MyClass(123);
        System.out.println(myClass.getStringVal());
    }
}