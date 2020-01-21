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
            }
        } else {
            // helpful message, if hop is negative, no hops take place.    
            System.out.println("No where to hop, sorry!");
        }
        System.out.println();
    }
}

/* Exercise 11: Write a mathod called threeHeads that repeatedly flips a coin 
 * until the results of the coin toss are three heads in a row. You should use
 * a Random object to make it equally likely that a head or a tail will appear.
 * Each time the coin is flipped, display H for heads or T for tails. When 
 * three heads in a row are flipped, the method should print a congratulatory 
 * message. 
 *
 * Author : Wali Morris
 * File   : HeadsOrTails.java
 * Date   : 01/20/2020
 */

import java.util.*;

public class HeadsOrTails {
    public static void main(String[] args) {
        threeHeads();
    }

    public static void threeHeads() {
        Random flip = new Random();

        int coin = flip.nextInt(2);
        int heads = 0;
        int tails = 0;
        while(heads != 3) {
            if(coin == 1) { // 1 = heads, 0 = tails
                heads ++;
                System.out.print("H");
            } else { // ruins the streak of coin landing on heads
                tails ++;
                System.out.print("T");
                heads = 0;
            }
            coin = flip.nextInt(2);
        }
        System.out.println("\nThree Heads, congrats!");
    }
}

/* Exercise 12: Write a method called printAverage that uses a sentinel loop to
 * repeatedly prompt the user for numbers. Once the user types any number less 
 * than zero, the method should display the average of all nonnegative numbers
 * typed. Display the average as a double. 
 *
 * Author : Wali Morris 
 * File   : SentinelAverage.java
 * Date   : 01/20/2020
 */

import java.util.*;

public class SentinelAverage {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        printAverage(console);
    }

    public static void printAverage(Scanner console) {
        double count = 0, num = 0, sum = 0, average = 0;
        while(num >= 0) {
            System.out.print("Enter a number [-1 to quit]: ");
            num = console.nextInt();
            if(num >= 0) {
                sum += num;
                count ++;
                average = sum/count;
            }
        }
        System.out.printf("Average: %.2f\n", average);
    }
}

/* Exercise 13: Write a method called consecutive that accepts three integers 
 * as parameter and returns true if they are three consecutive numbers - that is, 
 * if the numbers can be arranged into an order such that, assuming some integer k, 
 * the parameters' values are k, k+1, and k+2. Your method shoudl return false
 * if the integers are not consecutive. NOTE: the order is not significant; the
 * method should return the same result for the same three integers passed in 
 * any order. 
 *
 * Author : Wali Morris
 * File   : Consecutive.java
 * Date   : 01/21/2020
 */

public class Consecutive {
    public static void main(String[] args) {
        // run many tests
        boolean numList1 = consecutive(1, 2, 3); // true
        boolean numList2 = consecutive(1, 3, 2); // true
        boolean numList3 = consecutive(2, 1, 3); // true
        boolean numList4 = consecutive(2, 3, 1); // true
        boolean numList5 = consecutive(3, 2, 1); // true
        boolean numList6 = consecutive(3, 1, 2); // true
        boolean numList7 = consecutive(3, 5, 7); // false
        boolean numList8 = consecutive(1, 2, 2); // false
        boolean numList9 = consecutive(7, 7, 9); // false
        boolean numList10 = consecutive(9, 2, 4);// false 

        System.out.println("List 1 contains consecutive numbers(1,2,3): " + numList1);
        System.out.println("List 2 contains consecutive numbers(1,3,2): " + numList2);
        System.out.println("List 3 contains consecutive numbers(2,1,3): " + numList3);
        System.out.println("List 4 contains consecutive numbers(2,3,1): " + numList4);
        System.out.println("List 5 contains consecutive numbers(3,2,1): " + numList5);
        System.out.println("List 6 contains consecutive numbers(3,1,2): " + numList6);
        System.out.println("List 7 contains consecutive numbers(3,5,7): " + numList7);
        System.out.println("List 8 contains consecutive numbers(1,2,2): " + numList8);
        System.out.println("List 9 contains consecutive numbers(7,7,9): " + numList9);
        System.out.println("List 10 contains consecutive numbers(9,2,4): " + numList10);
    }
    
    /* for each of 3 integers there are 2 different patterns 2 * 3 = 6 different ways
     * three consecutive numbers can be ordered. If none of these consecutive patterns
     * are met, the list is returned false. 
     */
    public static boolean consecutive(int x, int y, int z) {
        boolean v1 = (z == y + 1 && y == x + 1); // 1,2,3 
        boolean v2 = (y == z + 1 && z == x + 1); // 1,3,2 
        boolean v3 = (z == x + 1 && x == y + 1); // 2,1,3
        boolean v4 = (y == x + 1 && x == z + 1); // 2,3,1
        boolean v5 = (x == y + 1 && y == z + 1); // 3,2,1
        boolean v6 = (x == z + 1 && z == y + 1); // 3,1,2 

        if(v1 || v2 || v3 || v4 || v5 || v6) {
            return true;
        } else {
            return false;
        }
    }
}

/* Write a method called hasMidpoint that accepts three integers as parameters 
 * and returns true if one of the integers is the midpoint between the other 
 * two integers; that is, if one integer is exactly halfway between them. Your 
 * method should return false if no such midpoint exists. 
 *
 * Author : Wali Morris 
 * File   : MidPoint.java
 * Date   : 01/21/2020
 */

public class MidPoint {
    public static void main(String[] args) {
        boolean point1 = hasMidpoint(7, 4, 10);
        boolean point2 = hasMidpoint(9, 15, 8);
        boolean point3 = hasMidpoint(5, 5, 5);
        System.out.println("Does point1 contain a midpoint(7, 4, 10): " + point1);
        System.out.println("Does point2 contain a midpoint(9, 15, 8): " + point2);
        System.out.println("Does point3 contain a midpoint(5, 5, 5): " + point3);
    }

    public static boolean hasMidpoint(int x, int y, int z) {
        boolean v1 = ((x + y) / 2 == z);
        boolean v2 = ((x + z) / 2 == y);
        boolean v3 = ((y + z) / 2 == x);
        boolean v4 = (y == x && x == z);
        if(v1 || v2 || v3 || v4) {
            return true;
        } else {
            return false;
        }
    }
}
