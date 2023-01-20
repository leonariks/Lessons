import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] myFirstArray;
        myFirstArray = new int[3];

        String[] mySecondArray = new String[5];

        System.out.println(myFirstArray.length);
        System.out.println(mySecondArray.length);

        myFirstArray[0] = 30;
        myFirstArray[2] = 5000;

        System.out.println(myFirstArray[0]);

        System.out.println(mySecondArray[0]);

        mySecondArray[1] = "Popik";

        System.out.println(mySecondArray[1]);

        String[] myThirdArray = new String[]{"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
        System.out.println(myThirdArray[5]);

        myThirdArray[6] = "Pipka";

        System.out.println(myThirdArray[6]);

        for (int i = 0; i < myThirdArray.length; i++) {

            System.out.println(myThirdArray[i]);
        }

        int[][] myFourthArray = new int[3][3];
        myFourthArray[0][0] = 12;
        myFourthArray[0][1] = 2;
        myFourthArray[0][2] = 4;
        myFourthArray[1][1] = 7;
        myFourthArray[1][2] = 9;
        myFourthArray[2][1] = 90;

        int[][] myFifthArray = {{1, 2, 3}, {4, 5, 6}, {7}};

        for (int i = 0; i < myFourthArray.length; i++) {

            for (int j = 0; j < myFourthArray[1].length; j++) {
                System.out.println("i= " + i + " " + "j= " + j + " " + myFourthArray[i][j]);
            }
        }

        for (int i: myFirstArray){

            System.out.println(i);
        }

        System.out.println(myFirstArray);
        System.out.println(Arrays.toString(myFirstArray));
        Arrays.sort(myFirstArray,0,2);
        System.out.println(Arrays.toString(myFirstArray));
        System.out.println(myFirstArray[0]);
        System.out.println(Arrays.binarySearch(myFirstArray,5000));
    }
}