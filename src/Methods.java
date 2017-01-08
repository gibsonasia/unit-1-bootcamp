import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

    public static void main(String args[]) {


        System.out.println(calculateSquare(2));
        System.out.println(calculateSquare(3));

        System.out.println(calculateSquareRoot(144));
        System.out.println(calculateSquareRoot(256));

        System.out.println(toLowerCase("Hello, World"));
        System.out.println(toLowerCase("RAHH"));

        System.out.println(isMultiple(5, 100));
        System.out.println(isMultiple(5, 101));

        System.out.println(random(10, 30));
        System.out.println(random(1,100));
        System.out.println(random(100,3));




    }

    public static int calculateSquare(int a) {

        return a * a;
    }

    public static double calculateSquareRoot(double b) {
        return Math.sqrt(b);
    }

    public static String toLowerCase(String c) {

        return c.toLowerCase();
    }

    public static boolean isMultiple(int x, int y) {

        if (y % x == 0) {
            return true;
        }
        return false;
    }

    public static int random(int e, int f) {
        Random r = new Random();

        if (e >= f) {
            return 0 ;
        }
        return r.nextInt((f - e) + 1) + e;
    }
}
