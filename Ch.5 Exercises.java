/* Exercise 1: Write a method called showTwos that shows the factors of 2 
 * in a given integer. 
 *
 * Author : Wali Morris 
 * File   : FactorsOf2.java
 * Date   : 01/17/2020 
 */

public class FactorsOf2 {
    public static void main(String[] args) {
        showTwos(7);
        showTwos(18);
        showTwos(68);
        showTwos(120);
    }

    /* This function takes one arguement, an integer n, which is 
     * decided if its divisible by two. If not, then 2 is not a 
     * factor of n. If n is divisible by two, showTwos() divides 
     * n / 2 and that value becomes n; until this n value % 2 
     * doesn't equal 0, the loop continues. Every iteration '2 *'
     * is added to the print summary. After the condition is met 
     * the final value of n is printed.
     */
    public static void showTwos(int n) {
        if(!(n % 2 == 0)) {
            System.out.printf(n + " = %d\n", n);
        } else {
            System.out.printf("%d = ", n);
            while(n % 2 == 0) {
                System.out.print("2 * ");
                n = n / 2;
            }

            System.out.println(n);
        }
    }
}

/* Exercise 2: Write a method called gcd that accepts two integers as 
 * parameters and returns the greatest common divisor of the two numbers.
 *
 * Author : Wali Morris 
 * File   : GreatestCommonDivisor.java
 * Date   : 01/17/2020
 */

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int gcdVar1 = gcd(270, 192);
        System.out.printf("GCD of 270, 192: %d\n", gcdVar1);
    }

    public static int gcd(int a, int b) {
        while( b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
