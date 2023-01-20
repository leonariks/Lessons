import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float a, b, result;

        Scanner scan = new Scanner(System.in);
        System.out.print("a=");
        a = scan.nextFloat();

        System.out.print("b=");
        b = scan.nextFloat();

        result = a + b;
        System.out.printf("%f+%f=%f", a, b, result);

        result = a - b;
        System.out.printf("\n%f-%f=%f", a, b, result);

        result = a * b;
        System.out.printf("\n%f*%f=%f", a, b, result);

        result = a / b;
        System.out.printf("\n%f/%f=%f", a, b, result);
    }
}