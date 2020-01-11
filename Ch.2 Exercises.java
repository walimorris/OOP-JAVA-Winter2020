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

        /* we could just say .5 in place of (double)1/2 and get the same
         * answer. Without explicitly converting 1/2 to .5 or without 
         * declaring (double) before 1/2, this computes to 0, and the 
         * answer is off */
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
        /* Allows any output after loop to continue on newline 
         * since print() was used. */
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
 * a mountain of letters, from 1-7
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
