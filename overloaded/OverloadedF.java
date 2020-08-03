public class OverloadedF {

    public static int max3(int a, int b, int c) {

        // Static method to compute the max int value of three given paramethers
        int max = 0;
        if ((a > b) && (a > c)) max = a;
        else if ((b > a) && (b > c)) max = b;
        else max = c;
        return max;
    }

    public static double max3(double a, double b, double c) {

        // Overloaded Function
        // Static method to compute the max double value of three given paramethers
        double max = 0.0;
        if ((a > b) && (a > c)) max = a;
        else if ((b > a) && (b > c)) max = b;
        else max = c;
        return max;
    }

    public static void main(String[] args) {

        // Read the three integer input values
        int a = StdIn.readInt(); // StdIn is a library provided by Princeton University
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        int max = max3(a, b, c); // Compute the max value
        System.out.print("The max value is: ");
        System.out.print(max);

        // Read the three double input values
        double aD = StdIn.readDouble();
        double bD = StdIn.readDouble();
        double cD = StdIn.readDouble();
        double maxD = max3(aD, bD, cD);
        System.out.print("The max value is: ");
        System.out.print(maxD);
    }
}