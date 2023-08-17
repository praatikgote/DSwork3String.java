//package String;

public abstract class compairtofun {

    public static void main(String[] args) {

        String names[] = { " pratik", "sakib", "anuja" };

        String largest = names[0];

        for (int i = 1; i < names.length; i++) {

            if (largest.compareTo(names[i]) < 0) {

                largest = names[i];

            }
        }

        System.out.println("largest string of the array is " + largest);

    }
}
