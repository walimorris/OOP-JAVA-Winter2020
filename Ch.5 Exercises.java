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
        return Math.abs(a);
    }
}

/* Exercise 4: Write a method called randomX that prints lines that contain a 
 * random number of "x" characters(between 5 and 20 inclusive) until it prints 
 * a line that contains 16 or more characters. 
 *
 * Author : Wali Morris 
 * File   : RandomX.java
 * Date   : 01/18/2020 
 */

import java.util.*;

public class RandomX {
    public static void main(String[] args) {
        randomX();
    }

    /* A psuedo random number is initalized and thrown into 
     * a do-while loop which ensures randomX() is conducted 
     * atleast once, in the rare case 16 happens to be the 
     * first random number and to ensure 16 x's are printed 
     * during any loop. The random number is then thrown 
     * into a for loop to iterate the number of times of the
     * random number to print x, random number is checked 
     * if it is 16, if not, the process is repeated.
     */
    public static void randomX() {
        Random r = new Random();
        int randomNum = 0;

        do {
            randomNum = 5 + r.nextInt(15);
            for(int i=0;i<randomNum;i++) {
                System.out.print("x");
            }
            System.out.println();
        } while(randomNum != 16);
    }
}
