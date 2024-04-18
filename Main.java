public class Main {
    public static void main(String[] args) {
        // Get the two numbers from the command line arguments
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        // Find the Fibonaccisum of up to the nth and mth number and then find the GCD of the two sums
        findGcd(findFibonacciSum(n), findFibonacciSum(m));
    }

    public static int findFibonacciSum(int n) {
        // Initialise the first two numbers of the Fibonacci sequence
        int a = 0, b = 1, c = 0, sum = 1;
        // Check if the input is valid. If not, set the input to 0 or 45 depending on whats closer
        if (n < 0) {
            n = 0;
            System.out.println("input cannot be negative, setting input to 0");
            System.out.println("The sum of the first " + n + " Fibonacci numbers is " + 0);
            return 0;
        } else if (n == 0) {
            System.out.println("The sum of the first " + n + " Fibonacci numbers is " + 0);
            return 0;
        } else if (n == 1) {
            System.out.println("The sum of the first " + n + " Fibonacci numbers is " + 1);
            return 1;
        } else if (n > 45) {
            System.out.println("The number is too large to calculate the sum of the Fibonacci sequence. The maximum number is 45. Input will be set to 45.");
            n = 45;
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
}
    
