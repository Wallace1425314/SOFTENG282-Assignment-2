public class Main {
    public static void main(String[] args) {
        System.out.println(findFibonacciSum(4));
        System.out.println(findFibonacciSum(3));
        System.out.println(findFibonacciSum(10));
        System.out.println(findGcd(10, 15));
        System.out.println(findGcd(14, 28));
        System.out.println(findGcd(3, 9));
    }

    public static int findFibonacciSum(int n) {
        // Initialise the first two numbers of the Fibonacci sequence
        int a = 0, b = 1, c = 0, sum = 1;
        // If n is less than or equal to 2 then return the corresponding fibbonaci sum
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        }
        // Calculate the sum of the Fibonacci sequence up to the nth number
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            sum += c;
        }
        return sum;
    }

    public static int findGcd(int a, int b) {
        // Find the GCD of two numbers by using the Euclidean algorithm
        if (b == 0) {
            return a;
        }
        return findGcd(b, a % b);
    }


}
    
