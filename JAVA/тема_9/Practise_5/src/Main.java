import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму в рублях: ");
        int rur = in.nextInt();
        System.out.println("Введите курс евро: ");
        double course = in.nextDouble();
        double result = toEURO(rur, course);

        System.out.println(result);

        System.out.println("Введите сумму в рублях: ");
        rur = in.nextInt();
        System.out.println("Введите курс евро: ");
        course = in.nextDouble();
        result = toEURO(rur, course);

        System.out.println(result);

        System.out.println("Введите значение : ");
        int a = in.nextInt();
        System.out.println("Введите степень значения : ");
        int j = in.nextInt();
        System.out.println(GetPow(a, j));
    }

    static double toEURO(int rur, double course) {

        return rur / course;
    }

    static int GetPow(int a, int j){
        int res = 1;
        for (int i = 0; i < j; i++){
            res*=a;
        }
        return res;
    }
}