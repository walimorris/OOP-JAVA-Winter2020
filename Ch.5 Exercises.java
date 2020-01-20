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

    /* This function takes one arguement, an integer n, which is decided if its divisible 
     * by two. If not, then 2 is not a factor of n. If n is divisible by two, showTwos() 
     * divides n / 2 and that value becomes n; until this n value % 2 doesn't equal 0, 
     * the loop continues. Every iteration '2 *' is added to the print summary. After 
     * the condition is met the final value of n is printed.
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

    /* A psuedo random number is initalized and thrown into a do-while loop which ensures 
     * randomX() is conducted atleast once, in the rare case 16 happens to be the first 
     * random number and to ensure 16 x's are printed during any loop. The random number is 
     * then thrown into a for loop to iterate the number of times of the random number to  
     * print x, random number is checked if it is 16, if not, the process is repeated.
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

/* Exercise 6: Write a method called makeGuesses that guesses numbers between 1 
 * and 50 inclusive until it makes a guess of at least 48. It should report 
 * each guess and at the end should report the total number of guesses made. 
 *
 * Author : Wali Morris 
 * File   : Guesses.java
 * Date   : 01/19/2020
 */

import java.util.*;

public class Guesses {
    public static void main(String[] args) {
        makeGuesses();
    }

    public static void makeGuesses() {
        Random randomInteger = new Random();  

        int count = 1;
        int guess = randomInteger.nextInt(50) + 1;
        while(guess < 48) {
            System.out.printf("Guess = %d\n", guess);
            guess = randomInteger.nextInt(50) + 1;
            count++;
        }
        System.out.printf("Guess = %d\n", guess);
        System.out.printf("Total Guesses: %d\n", count);
    }
}

/* Exercise 7: Write a method called diceSum that accepts a Scanner for the 
 * console as a parameter and prompts for a desired sum, then repeatedly 
 * simulates the rolling of 2 six-sided dice until their sum is the desired sum. 
 *
 * Author : Wali Morris
 * File   : DiceGame.java
 * Date   : 01/19/2020
 */

import java.util.*;

public class DiceGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        diceSum(console);
    }

    public static void diceSum(Scanner console) {
        Random randomGenerator = new Random();

        int dice1 = randomGenerator.nextInt(6) + 1;
        int dice2 = randomGenerator.nextInt(6) + 1;
        int sum = dice1 + dice2;

        String error = "Sum should be atleast 2 and no greater than 12";
        System.out.print("Enter desired dice sum: ");
        int desiredSum = console.nextInt();
        if(desiredSum < 2 || desiredSum > 12) {
            throw new IllegalArgumentException(error);
        }
        System.out.println(dice1 + " and " + dice2 + " = " + sum);
        while(sum != desiredSum) {
            sum = 0;
            dice1 = randomGenerator.nextInt(6) + 1;
            dice2 = randomGenerator.nextInt(6) + 1;
            sum = dice1 + dice2;
            System.out.println(dice1 + " and " + dice2 + " = " + sum);
        } 
    } 
} 
