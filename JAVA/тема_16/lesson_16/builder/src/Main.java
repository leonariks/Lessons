public class Main {
    public static void main(String[] args) {
        String string = "Hello World";
        StringBuilder stringBuilder = new StringBuilder(string);
        char ch1 = stringBuilder.charAt(2);
        System.out.println(ch1);
        stringBuilder.setCharAt(0,'B');
        System.out.println(stringBuilder);
        String res = stringBuilder.toString();
        stringBuilder.append("!!!");
        System.out.println(stringBuilder);
        stringBuilder.insert(0, "H");
        System.out.println(stringBuilder);

        stringBuilder.delete(0,1);
        System.out.println(stringBuilder);
        stringBuilder.replace(0, 4, "Popik");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}