/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

    public static void main(String args[]) {

        printOneThrTen();
        printOneThrTenAgain();
        iThroughN(10);
        twosThroughN(10);
        sumOneThrTen();
        printStringNTimes(7, "happyhappy");
    }

    public static void printOneThrTen() {

        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("current num " + i);
        }
    }


    public static void printOneThrTenAgain() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i++);
        }

    }

    public static void iThroughN(int n) {

        int i;
        for (i = 1; i <= n; i++) {
            System.out.println("number " + i);
        }
    }

    public static void twosThroughN(int n) {

        int i;
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("evens " + i);

            }
        }
    }

    public static void sumOneThrTen() {

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            for (int x = 1; x <= i; x++) {
                sum = sum + x;
            }
            System.out.println(sum);
        }
    }

    public static void printStringNTimes(int n, String s) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.println(s);

            }

        } else {
            System.out.println("");

        }

    }

    public static void printStrConTimes(int n, String s) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(s);
            }
        } else {
            System.out.println("");
        }
    }
}

