//package String;

public class StringCompression {

    public static String Compression(String s1) {

        String newstring = " ";

        for (int i = 0; i < s1.length() - 1; i++) {
            Integer count = 1;
            while (i < s1.length() - 1 && s1.charAt(i) == s1.charAt(i + 1)) {
                count++;
                i++;
            }

            newstring += s1.charAt(i);

            if (count > 1) {
                newstring += count.toString();
            }

        }

        return newstring;

    }

    public static void main(String[] args) {

        String s1 = "aabbccc";

        System.out.print(Compression(s1));

    }

}
