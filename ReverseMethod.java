public class ReverseMethod {
    /**
     * Write a static method reverse() that takes a string as an argument and returns a string that
     * contains the same sequence of characters as the argument string but in reverse mode.
     */

    public static String reverse(String text) {

        String txt = new String();
        int n = text.length();

        for (int i = 0; i < n; i++) {
            char a = text.charAt(n - 1 - i);
            txt += a;
        }

        return txt;
    }

    public static void main(String[] args) {
        String s = new String(args[0]);
        StdOut.print(reverse(s));
    }
}