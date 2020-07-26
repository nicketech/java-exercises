public class SieveOfEratosthenes {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];

        // Set all the values of isPrime to true
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Multiply every prime number and set to false
        for (int i = 2; i <= n / i; i++) {
            if (isPrime[i]) {
                for (int j = i; j <= n / i; j++) {
                    isPrime[i * j] = false;
                }
            }
        }

        // Count the primes numbers
        int primes = 0;
        for (int i = 0; i <= n; i++)
            if (isPrime[i])
                primes++;

        System.out.println(primes);
    }
}
