//package String;

public class ShortestPAth {

    public static float getshortestpath(String path) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {

            char direction = path.charAt(i);

            if (direction == 'N') {
                y++;
            } else if (direction == 'S') {
                y--;
            }

            else if (direction == 'w') {

                x--;

            } else {
                x++;
            }
        }

        int x2 = x * x;
        int y2 = y * y;

        return (float) (Math.sqrt(x2 + y2));

    }

    public static void main(String args[]) {

        String path = "NS";

        System.out.println(getshortestpath(path));

    }

}
