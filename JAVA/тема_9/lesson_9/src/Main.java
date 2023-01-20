import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        myMethod();
        mySecondMethod(12, 10, "Hipe", true);
        myArrayMethod(new int[]{1, 2, 3, 7, 88});
        myParrMethod(44, 55, 66, 70, 0);
        mySecondParrMethod("Azyzyzy!");
        int res = sum(1, 1);
        int result = sum(1234, 12, 1);
        System.out.println(result);
        System.out.println(sum(1, 1.5));
        System.out.println(res);
        myMethodFor();

    }

    static void myMethod() {

        Scanner in = new Scanner(System.in);
        String a = in.next();
        System.out.println("Hi " + a);
    }

    static void mySecondMethod(int a, int b, String name, boolean bool) {

        System.out.println((a + b) + name + bool);
    }

    static void myArrayMethod(int[] a) {
        for (int i : a) {
            System.out.println(i);
        }

    }

    static void myParrMethod(int... a) {

        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("gik");
    }

    static void mySecondParrMethod(String mess, int... a) {

        for (int i : a) {
            System.out.println(i);
        }
        System.out.println(mess);
    }

    static int sum(int a, int b) {

        if (a > b) {
            return a;
        }
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static String sum(int a, double b){
        return "kdjn fg";
    }


    static void myMethodFor() {
        int a = 0;
        for (; ; ) {
            a += 3;
            System.out.println(a);
            if (a == 30) {
                return;
            }
            ;
        }
    }
}