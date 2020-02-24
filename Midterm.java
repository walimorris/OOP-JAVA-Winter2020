/* Write a program that simulates an ant trying to crawl up a building 
 * of height 6 steps. The ant starts on the ground, at height 0. Each 
 * iteration, the ant either crawls up one step, or slips off and falls 
 * all the way back to the ground. There is a 50% chance on each iteration 
 * that the ant will slip. 
 *
 * Author: Wali Morris & Samuel Tegegn
 * Course: ITC 115 
 * File  : AntCrawl.java 
 * Date  : 02/24/2020 
 */

import java.util.*;

public class AntCrawl {
    public static void main(String[] args) {
        Random r = new Random(); // initialize random object 

        int steps = 6; // number of steps to climb 
        int height = 0; // where the ant is starting 
        int fall = 0; // start at zero falls 
        while(height < steps) {
           int random = r.nextInt(2); // 0 = fall, 1 = climb 
           if(random == 0) {
               fall++; // add 1 if ant falls
           } else {
               height++; // add 1 if ant climbs 
           }
        }
        System.out.println("Number of falls before reaching top: " + fall);
    }
}

/* Write a static method isPowerOfTwo that takes an integer n as an argument
 * and that returns if n is a power of two. Other wise False. If n is zero 
 * or negative return False. 
 *
 * Authors: Samuel Tegegn & Wali Morris 
 * Course : ITC 115
 * File   : PowerOfTwo.java
 * Date   : 02/24/2020
 */

import java.util.*;

public class PowerOfTwo {
    public static void main(String[] args) {
        // Test cases     
        boolean test1 = isPowerOfTwo(8); // pass
        boolean test2 = isPowerOfTwo(5); // pass
        boolean test3 = isPowerOfTwo(3); // pass
        boolean test4 = isPowerOfTwo(1); // pass
        boolean test5 = isPowerOfTwo(0); // pass        
        System.out.println("8 is a power of 2: " + test1);
        System.out.println("5 is a power of 2: " + test2);
        System.out.println("3 is a power of 2: " + test3);
        System.out.println("1 is a power of 2: " + test4);
        System.out.println("0 is a power of 2: " + test5);
    }
    
    public static boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        /* loop until condition is met. At any point, if n is not divible by two 
         * return false. Otherwise, return true. 
         */
        while(n > 1) { // loop is complete and n is still divisible by 2, jump to end: return true
            if(n % 2 == 0) {
                 n = n / 2;
            } else { // at any point n is not divisible by 2, return false 
                 return false;
            }
        }
        return true;
    }
}

