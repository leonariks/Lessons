public class Main {
    public static void main(String[] args) {
        String string = "Hello World";
        StringBuilder stringBuilder = new StringBuilder(string);
        char ch1 = stringBuilder.charAt(2);
        System.out.println(ch1);
        stringBuilder.setCharAt(0,'B');
        System.out.println(stringBuilder);

        stringBuilder.append("!!!");
        System.out.println(stringBuilder);
    }
}