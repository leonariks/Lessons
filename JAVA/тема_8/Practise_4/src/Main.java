import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = in.nextInt();
        int[] myFirst = new int[a];

        int i = 0;

        while (i < a) {
            System.out.println("Введите значение: ");
            myFirst[i] = in.nextInt();
            i++;
        }
        Arrays.sort(myFirst);

        System.out.println(Arrays.toString(myFirst));

        System.out.println("Введите два значения: ");
        int b = in.nextInt();
        int c = in.nextInt();

        int[][] mySecond = new int[b][c];

        for (int j = 0; j < mySecond.length; j++) {
            for (int e = 0; e < mySecond.length; e++) {
                System.out.println("Введите значение: ");
                mySecond[j][e] = in.nextInt();
            }
        }

        System.out.println("Сумма значений = ");
        int result = 0;
        for (int[] arr : mySecond) {
            for (int k : arr) {

                result += k;
            }
        }

        System.out.println(result);
    }

}