/**
 * Created by alexandraqin on 4/14/15.
 */
public class Variables {


    public static void main(String args[]) {
        int a = 113;
        double b = 2.71828;
        String c = "Computer Science";

        System.out.print("This is room # " + a + "\n" +
                "e is close to " + b + "\n" + "I am learning a bit about " + c);

    }

    boolean isOdd(int a) {
        return (a % 2 != 0);
    }

    public String printHelloWorld() {
        return "Hello world";
    }

    int greatestCommonFactor(int x, int y) {
        if (x == 0) {
            return y;
        }

        while (y != 0) {
            if (x > y) {
                return x = x - y;
            }
            return y = y - x;
        }
        return x;
    }

}
