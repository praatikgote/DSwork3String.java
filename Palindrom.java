//package String;

import java.util.*;

public class Palindrom {

    public boolean ispalindrom(String myString) {

        // int n = myString.length();

        for (int i = 0; i < myString.length() / 2; i++) {

            if (myString.charAt(i) != myString.charAt(myString.length() - 1 - i)) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String mystring = sc.next();

        Palindrom p1 = new Palindrom();

        System.out.println(p1.ispalindrom(mystring));

        sc.close();

    }

}
