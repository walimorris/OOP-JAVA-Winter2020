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

/* Exercise 8: Write a method called randomWalk that performs steps of a random 
 * one-dimensional walk. The random walk should begin at position 0. On each step, 
 * you should either increase or decrease the position by one(equal probabilty)
 * Your code should continue making steps util a position of 3 or -3 is reached
 * and then report the maximum position that was reached during the walk.
 *
 * Author : Wali Morris 
 * File   : RandomWalk.java
 * Date   : 01/20/2020 
 */

import java.util.*;

public class RandomWalk {
    public static void main(String[] args) {
        randomWalk();
    }

    public static void randomWalk() {
        Random randomGenerator = new Random();

        int walk = randomGenerator.nextInt(2);
        int sum = 0;
        while(sum != 3 && sum != -3) {
            if(walk == 0) {
                sum ++;
            } else {
                sum --;
            }
            System.out.printf("Pos: %d\n", sum);
            walk = randomGenerator.nextInt(2);
        }
    }
}

/* Warmup: In order to practice fencepost loop algorithms; write a solution to 
 * print the integers 1 - n seperated by a comma. There should be n-1 commas in 
 * total: 1,2,3,4,5,6,7,8,9,10,...,...,..n.
 *
 * Author : Wali Morris
 * File   : FencePost.java
 * Date   : 01/20/2020
 */

public class FencePost {
    public static void main(String[] args) {
        jumpOffPost(10);
        jumpOffPost(20);
        jumpOffPost(5);
    }

    public static void jumpOffPost(int n) {
        System.out.print("1");
        for(int i=2;i<=n;i++) {
            System.out.print("," + i);
        }
        System.out.println();
    }
}

/* Exercise 9: Write a method called printFactors that accepts an integer as 
 * its parameter  and uses a fencepost loop to print the factors of that number, 
 * seperated by the word "and". 
 *
 * Author : Wali Morris
 * File   : MoreFactors.java
 * Date   : 01/20/2020
 */

public class MoreFactors {
    public static void main(String[] args) {
        printFactors(24);
        printFactors(12);
        printFactors(1);
        printFactors(100);
    }

    // pre: fact must be greater than 0 
    public static void printFactors(int fact) {
        if(fact <= 0) {
             throw new IllegalArgumentException();
        }
        System.out.print("1");
        for(int i=2;i<=fact;i++) {
            for(int j=1;j<=fact;j++) {
                if(i * j == fact)
                    System.out.print(" and " + i);
            }
        }
        System.out.println();
    }
}

/* Exercise 10: Write a method called hopscotch that accepts an integer number
 * of "hops" as its parameter and prints a pattern of numbers that resembles
 * a hopscotch board. A "hop" is a three-number sequence where the output shows
 * two numbers on a line, followed by one number on its own line. 
 *
 * Author : Wali Morris
 * File   : HopScotch.java
 * Date   : 01/20/2020
 */

public class HopScotch {

    public static void main(String[] args) {
        hopscotch(3);
        hopscotch(2);
        hopscotch(1);
        hopscotch(0);
        hopscotch(-1);
    }
    
    public static void hopscotch(int hops) {
        if(hop >= 0) {
            System.out.println("  " + "1" + "  ");
            for(int i=2;i<3*hops;i+=3) {
                System.out.print(i + "   ");
                System.out.println(i+1);
                System.out.print("  ");
                System.out.print(i+2);
                System.out.println("  ");
            }
        } else {
            // helpful message, if hop is negative, no hops take place.    
            System.out.println("No where to hop, sorry!");
        }
        System.out.println();
    }
}
