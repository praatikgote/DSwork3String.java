//package String;

public class ConvertFirstletterto_Upper {

    public static String ConverttUpper(String s1) {

        StringBuilder sb = new StringBuilder(" ");

        char ch = Character.toUpperCase(s1.charAt(0));

        sb.append(ch);

        for (int i = 1; i < s1.length(); i++) {

            if (s1.charAt(i) == ' ' && i < s1.length() - 1) {

                sb.append(s1.charAt(i));
                i++;

                sb.append(Character.toUpperCase(s1.charAt(i)));
            }

            else {

                sb.append(s1.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String s1 = "pratik gote is the student of sppu university";

        System.out.println(ConverttUpper(s1));
    }

}
