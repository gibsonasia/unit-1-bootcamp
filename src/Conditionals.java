/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

    public static void main(String args[]) {
        System.out.printf(fizzMultipleofThree(19));
        System.out.println(evenlySpaced(3, 6, 9));
    }

    boolean isOdd(int a) {
        if (a % 2 == 1) {
            return true;
        }
        return false;
    }

    boolean isMultipleOfThree(int a) {
        if (a % 3 == 0) {
            return true;
        }
        return false;
    }

    boolean isOddAndIsMultipleOfThree(int a) {
        if (a % 3 == 0 && a % 2 == 1) {
            return true;
        }
        return false;
    }

    public static String fizzMultipleofThree(int n) {
        if (n % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(n);
    }

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && cigars <= 60) {
            return true;
        } else if (isWeekend && cigars > 40) {
            return true;

        }
        return false;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int noTicket = 0;
        int smallTicket = 1;
        int bigTicket = 2;

        if (isBirthday && speed == (speed + 5)) {
            return noTicket;
        }

        if (speed <= 60 && !isBirthday) {
            return noTicket;
        } else if (isBirthday && speed == (speed + 5)) {
            return noTicket;
        } else if (speed > 60 && speed <= 80 && !isBirthday) {
            return smallTicket;

        } else if (speed > 80 && !isBirthday) {
            return bigTicket;
        }
        return noTicket;

    }

    public String alarmClock(int day, boolean vacation) {
        int sun = 0;
        int mon = 1;
        int tue = 2;
        int wed = 3;
        int thu = 4;
        int fri = 5;
        int sat = 6;

        boolean currentDay;

        if (!vacation) {
            return "0ff";
        }
        return "10:00";
    }

    public int greenTicket(int a, int b, int c) {

        if (a == c && a == b && c == a && c == b && b == a && b == c) {
            return 20;
        } else if (a != c && a != b && c != a && c != b && b != a && b != c) {
            return 0;
        }
        return 10;
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int ab = Math.abs(a - b);
        int bc = Math.abs(b - c);
        int ac = Math.abs(a - c);
        return (ab == bc && ac == ab + bc) ||
                (ab == ac && bc == ab + ac) ||
                (bc == ac && ab == ac + bc);
    }

    public int blackjack(int a, int b) {

        if (a > 21 && b > 21) {
            return 0;
        }

        if (a > 21) {
            return b;
        }

        if (b > 21) {
            return a;
        }

        if ((21 - a) <= (21 - b)) {
            return a;
        }

        if ((21 - a) >= (21 - b)) {

            return b;
        }

        return 0;
    }


}
