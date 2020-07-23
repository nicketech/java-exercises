public class Hellos {
    public static void main(String[] args) {
        /*
        The programe takes an argument as an integer less than 1000 and print one line
        of hello for the times of the input.

        Input
            Integer number less then 1000.

        Output
            Print one line for the times of the input with 'st' 'nd' 'rd' 'th'.
         */

        int x = Integer.parseInt(args[0]);

        if (x <= 1000) {
            for (int a = 0; a < x; a++) {
                if (a % 10 == 1 || a == 1) {
                    System.out.println(a + "st Hello");
                } else if (a % 10 == 2 || a == 2) {
                    System.out.println(a + "nd Hello");
                } else if (a % 10 == 3 || a == 3) {
                    System.out.println(a + "rd Hello");
                } else
                    System.out.println(a + "th Hello");
            }
        } else {
            System.out.println("Only enter a number less then 1000");
        }
    }
}
