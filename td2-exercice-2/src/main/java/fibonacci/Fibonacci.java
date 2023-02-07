package fibonacci;

public class Fibonacci {
    public static long fibonacci(long n) {
        if (n <= 1) return n;
        long prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            long temp = prev + curr;
            prev = curr;
            curr = temp;
        }
        return curr;
    }

}
