public class DoubleCheck {
    public static void main(String[] args) {
        /*
        If variables one and two are both strictly between 0 and 1 print 'True'
        otherwise print 'False'.
        */

        double one = Double.parseDouble(args[0]);
        double two = Double.parseDouble(args[1]);

        boolean isIt = ((one > 0 && one < 1) && (two > 0 && two < 1));

        if (isIt) {
            if (two > 0 && one < 1)
                System.out.println("True");
        } else
            System.out.println("False");
    }
}
