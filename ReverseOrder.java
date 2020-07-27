import java.util.Arrays;

public class ReverseOrder {
    public static void main(String[] args) {

        int n = 20;
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = i;
        }

        int a = 1;
        for (int i = 0; i < n / 2; i++) {

            int b = x[i];
            x[i] = x[n - a];
            x[n - a] = b;
            a++;
        }

        System.out.println(Arrays.toString(x));
    }
}