// Write a static methos majority() that takes three booleans arguments and returns
// true if at least two of the arguments are true, and false otherwise.
// Do not use an if statement.

public class TwoAtList {

    public static boolean majority(boolean a, boolean b, boolean c) {

        boolean result = (a && b) || (a && c) || (b && c);
        return result;
    }

    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;
        boolean c = false;

        boolean result = majority(a, b, c);
        System.out.print(result);
    }
}