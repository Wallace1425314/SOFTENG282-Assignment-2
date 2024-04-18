The code will first find the sum of the first n and m numbers in the Fibonacci sequence, then it will find the GDC of these two numbers using the Euclidean algorithm.


How to compile and run:
first open the command line and go to the directory where the Main.java file is stored.
Then run the command "javac Main.java" to compile the file.
Once compiled you can then execute the code with "Main a b" where a and b are integer inputs. e.g "Main 3 4", This will give the output:
"The sum of the first 3 Fibonacci numbers is 2
The sum of the first 4 Fibonacci numbers is 4
The GCD of the two numbers is 2"

Bounds:
This only works for integers.
If the input number is less than 0 it will be set to zero.
This code only works up to the first 45 numbers in the Fibonacci sequence before it gets too large for the int type so if the input value is higher than 45 it will be set to 45.

tests:

Test for edge case 0 -1
Input: 
Main 0 -1

Output: 
The sum of the first 0 Fibonacci numbers is 0
input cannot be negative, setting input to 0
The sum of the first 0 Fibonacci numbers is 0
The GCD of the two numbers is 0

Test for valid numbers
Input:
Main 10 36

Output:
The sum of the first 10 Fibonacci numbers is 88
The sum of the first 36 Fibonacci numbers is 24157816
The GCD of the two numbers is 8

Test for edge case 45 46
Input:
Main 45 46

Output:
The sum of the first 45 Fibonacci numbers is 1836311902
The number is too large to calculate the sum of the Fibonacci sequence. The maximum number is 45. Input will be set to 45.
The sum of the first 45 Fibonacci numbers is 1836311902
The GCD of the two numbers is 1836311902