public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String();
        String str3 = new String(new char[]{'H','e','l','l','o'},2,2);
        char[] chars = str1.toCharArray();
        String str4 = null;

        System.out.println(str2.length());
        System.out.println(chars[1]);

        if(str4==null) System.out.println("str4 is null");

        String str5 = "World";

        String strRes1 = str1 + str5;
        String strRes2 = str1.concat(str5);
        String strRes3 = String.join(" ", str1,str5,str3);

        char char1 = str1.charAt(0);


        System.out.println(strRes3);
        System.out.println(char1);

        char[] chars2 = new char[2];
        str1.getChars(2, 4, chars2, 0);
        System.out.println(chars2);
        String str6 = "hello";
        System.out.println(str1.equalsIgnoreCase(str6));

        System.out.println(str1.indexOf("lgg"));
        System.out.println(str1.indexOf('l'));
        System.out.println(str1.lastIndexOf('l'));
        System.out.println(str1.startsWith("hgh"));
        System.out.println(str1.endsWith("lohjk"));
        System.out.println(str1.replace("ll", "lllllllll"));

        String str7 = "     ghjkj   kl     ";
        System.out.println(str7.trim());
        str7=str7.trim();
        System.out.println(str7);
        System.out.println(str7.substring(8,10));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        String str8 = "qwer]dfghj]cvbn]";
        String[] strings = str8.split("]");
        for (String str:strings){
            System.out.println(str);
        }



    }
}