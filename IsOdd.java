// Write a static method odd() that takes three boolean arguments and returns true
// if an odd number of the argument values are true, and false otherwise.

public class IsOdd {

    public static boolean odd(boolean a, boolean b, boolean c) {

        int total = 0; // total of true values

        if (a == true) total += 1;
        if (b == true) total += 1;
        if (c == true) total += 1;

        if (total == 1 || total == 3) return true;
        else return false;
    }

    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;
        boolean c = true;

        boolean result = odd(a, b, c);
        System.out.print(result);
    }
}