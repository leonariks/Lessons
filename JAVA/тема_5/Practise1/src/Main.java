public class Main {
    public static void main(String[] args) {

        short s = 128;
        byte b = (byte)s;

        float f = 3.14f;
        double d1 = f;

        char c ='z';
        int i1 = c;

        long l = 12345678;
        int i2 = (int)l;

        int i3 = 12345678;
        double d2 = i3;

        double d3 = 1.65;
        int i4 = (int) Math.round(d3);

        System.out.println(b);
        System.out.println(d1);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(d2);
        System.out.println(i4);
    }
}