public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        findGcdOfTwoFibonacciSums(n, m);
    }

    public static int findFibonacciSum(int n) {
        // Initialise the first two numbers of the Fibonacci sequence
        int a = 0, b = 1, c = 0, sum = 1;
        // If n is less than or equal to 2 then return the corresponding fibbonaci sum
        if (n <= 0) {
            System.out.println("The sum of the first " + n + " Fibonacci numbers is " + 0);
            return 0;
        } else if (n == 1) {
            System.out.println("The sum of the first " + n + " Fibonacci numbers is " + 1);
            return 1;
        }
        // Calculate the sum of the Fibonacci sequence up to the nth number
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            sum += c;
        }
        System.out.println("The sum of the first " + n + " Fibonacci numbers is " + sum);
        return sum;
    }

    public static int findGcd(int a, int b) {
        // Find the GCD of two numbers by using the Euclidean algorithm
        if (b == 0) {
            System.out.println("The GCD of the two numbers is " + a);
            return a;
        }
        return findGcd(b, a % b);
    }

    public static int findGcdOfTwoFibonacciSums(int n, int m) {
        // Find the GCD of two values and find the sum of the Fibonacci sequence up to the GCD
        return findGcd(findFibonacciSum(n), findFibonacciSum(m));
    }
}
    
