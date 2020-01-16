//Chapter2: Primitive data types;Definite Loops; for loops; nested loops and managing complexity.
//By: Wali Morris 

/* Exercise 1: In physics, a common useful equation for finding the 
 * position s of body in linear motion at a given time t, based on its 
 * initial pos s0, initial velocity v0, and rate of acceleration a, is: 
 * s = s0 + vot + 1/2at^2
 * Write code to compute s on the basis of these values. 
 *
 * Author : Wali Morris 
 * File   : PositionOfS.java 
 * Date   : 01/10/2020 
 */

public class PositionOfS {
    public static void main(String[] args) {
        int s0=43, v0=32, t=21, a=5;

        /* We could just say .5 in place of (double)1/2 and get the same
         * answer. Without explicitly converting 1/2 to .5 or without 
         * declaring (double) before 1/2, if so, this would computes to 0
         * and the answer will be incorrect.
         */
        double s = s0 + (v0*t) + (double)1/2 * (a*t*t);
        System.out.println("The position s = " + s);
    }
}

/* Exercise 2: Write a for loop that produces the following output: 
 * 1 4 9 16 25 36 49 64 81 100
 *
 * Author : Wali Morris 
 * File   : LoopsAreSoFun.java 
 * Date   : 01/10/2020
 */

public class LoopsAreSoFun {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++) {
            System.out.print(i*i + " ");

        }
        
        System.out.println();
    }
}

/* Exercise 3: The Fibonacci numbers are a sequence of integers in which the first two 
 * elements are  1, and each following element is the sum of the two preceding
 * elements.  
 *
 * Author : Wali Morris 
 * File   : Fibonacci.java
 * date   : 01/10/2020
 */

public class Fibonacci {
    public static void main(String[] args) {
        int k = 12, num1 = 0, num2 = 1;

        /* k is a counter and represents the number of iterations 
         * through the fibonnaci sequence. The first number in the
         * sequence is 1. num1(first number in sequence) is 
         * initialized to zero. This is because num2(which is 1) 
         * will be added to the preceding num1 to equal the sum(1). 
         * num1 becomes num2(the sum of 0 + 1). num1 is then printed, 
         * which represents the current number in the sequence. This 
         * is repeated until the counter = 12(kth Fibonnaci num in 
         * the sequence).
         */
        for(int i=1;i<=k;i++) {
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.print(num1 + " ");
        }

        System.out.println();
    }
}

/* Exercise 4: Write a nested for loop to produce 4 rows of 4 stars.
 *
 * Author : Wali Morris
 * File   : StarsOf5.java
 * Date   : 01/10/2020
 */

public class StarsOf5 {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=5;j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}

/* Exercise 5: Write nested for loops to produce a figure that starts
 * with 1 star and increments to 5
 *
 * Author : Wali Morris
 * File   : StarMountain.java
 * Date   : 01/10/2020
 */

public class StarMountain {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            for(int k=1;k<=i;k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

/* Exercise 6: Write nested for loops to produce a figure that prints 
 * a mountain of numbers, from 1-7
 *
 * Author : Wali Morris 
 * File   : LuckySeven.java
 * Date   : 01/10/2020
 */

public class LuckySeven {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}

/* Exercise 7: Write a nested for loop to produce a stairwell figure 
 * that begins with the with 1 down to the given integer. 
 *
 * Author : Wali Morris 
 * File   : StairWell.java
 * Date   : 01/15/2020 
 */

import java.util.*;

public class StairWell {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("How many stairs: ");
        int stairs = console.nextInt();
        /* Initialize i to stairs and decrement ever iteration
         * of the outter loop. Enter the inner loop and initialize 
         * int j to i, write a space for every number i(stairs). 
         * After the inner loop iterations decrement j. Next 
         * iteration will write 1 less space to the console, creating
         * a figure that prints each integer down and in. 
         */
        for(int i=stairs;i>=1;i--) {
            for(int j=i;j>=1;j--) {
                System.out.print(" ");//continual spaces are written with print() 
            }

            System.out.println(i);// integer i is final printed and ends nested loop iteration
        }
    }
}

/* Exercise 10: It's common to print a rotating, increasing list of 
 * single-digit numbers at the start of a program's output as a visual 
 * guide to number the columns of the output to follow. With this in 
 * mind, write nested for loop to produce the following output 60 
 * characters wide:
 *
 *          |         |         |         |         |         |
 * 123456789012345678901234567890123456789012345678901234567890           
 *
 * Author : Wali Morris 
 * File   : VisualLoops.java 
 * Date   : 01/16/2020
 */

public class VisualLoops {
    /* This for loop initializes an empty string to hold our
     * visual numbers. Every loop(9 inner loops) writes 9 spaces, 
     * the outer loop(6 loops) prints "|"(this is the 10th character)
     * and lastly concatenates visual numbers 6 times, for each outer
     * loop. Outside of the loop, the final visual numbers string is 
     * printed. 
     */
    public static void main(String[] args) {
        String visualNumbers = "";
        for(int i=1;i<=6;i++) {
            for(int j=1;j<=9;j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            visualNumbers += "1234567890";
        }
        System.out.println("\n" + visualNumbers);
    }
}

