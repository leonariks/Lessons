import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, result;
        a = 10;
        b = 3;
        double resultD, aD;

        aD = 10;

        result = a + b;
        result = a - b;
        result = a * b;
        resultD = aD / b;

        result = a % b;
        //    b = ++a;
        // b = a++;

        // b = --a;

        //b=a--;

        result = a + a * --b;

        Scanner in = new Scanner(System.in);
        System.out.print("a=");
        var something = in.nextBoolean();
        System.out.println(something);

//        a = in.nextInt();
//        System.out.print("b=");
//        b = in.nextInt();
//
//        result = a +b;
//        System.out.printf("%d + %d = %d", a, b, result);

        //System.out.printf("result=%f b=%c \n", resultD, 'x');
        //System.out.println(b);
    }
}