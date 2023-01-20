public class Main {
    public static void main(String[] args) {
//        System.out.println(0);
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);

//        for (byte i = 0; ; i++) {
//
//            if (i < -2) {
//                break;
//            }
//            if (i == 50){
//
//                continue;
//            }
//            System.out.println(i);
//        }
//        System.out.println("syka");

        int j = 50;

        while (j > 0) {
            System.out.println(j);
            j--;
        }
        j = 10;
        do {
            System.out.println("do "+j);
            j--;
        } while (j > 0);
    }
}