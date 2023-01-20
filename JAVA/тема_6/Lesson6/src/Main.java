import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a = 12;
        int b = 10;
        boolean res;

        res = a == b;
        res = a == 12;

        res = a != b;
        res = a != 12;

        res = a > b;
        res = a < b;

        res = a >= b;

        res = (b > a) || (a > b);
        res = (b > a) || (a < 1);

        res = (b > a) && (a > b);
        res = (13 > a) && (a == 12);

        res = (b > a) ^ (a > b);
        res = (b != a) ^ (a > b);

        res = !true;
        res = !(a == 12);

        System.out.println(res);


        int c = 7;
        int d = 10;

        if (c > d) {

            System.out.println("c>d");
        } else if (c == d) {

            System.out.println("c=d");
        } else {

            System.out.println("c<d");
        }


        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        switch (input) {

            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("Jun");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("Sept");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;

            default:
                System.out.println("No month");
                break;
        }

        int q = 5;
        int w = 6;
        int res1 = q > w ? (q * w) : (q - w);
        System.out.println(res1);
    }
}