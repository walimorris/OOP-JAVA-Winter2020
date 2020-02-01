// All about arrays! 

/* Exercise 1: Write a method called lastIndexOf that accepts an array of 
 * integers and an integer value as its parameters and returns the last index 
 * at which the value occurs in the array. The method should return -1 if the 
 * value is not found. 
 *
 * Author : Wali Morris 
 * File   : LastIndex.java 
 * Date   : 02/01/2020 
 */

import java.util.*;

import java.util.*;

public class LastIndex {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] data = {74, 85, 102, 99, 101, 85, 56}; // create array

        System.out.println("A list containing: 74, 85, 102, 99, 101, 85, 56.");
        System.out.print("Choose a number and the index of its last occurance");
        System.out.print(" will be returned: ");
        int num = console.nextInt(); // user chose num

        int indexOfNum = lastIndexOf(data, num); // pass array, and chosen num 
        System.out.println("The last occurance of " + num + " is index " + indexOfNum);
    }

    public static int lastIndexOf(int[] data, int num) {
        int lastIndex = 0; // initialize a index to represent last index 
        for(int i=0;i<data.length;i++) {
            // loop through array, if num is found that index becomes last seen index of num    
            if(data[i] == num) {
                lastIndex = i;
            }
        }
        return lastIndex;   
    }
}

/* Exercise 2: Write a method called range that returns the range of values in an array
 * of integers. The range is defined as 1 more than the difference between the max and 
 * min values in the array. 
 *
 * Author : Wali Morris 
 * File   : Ranges.java 
 * Date   : 02/01/2020
 */

import java.util.*;

public class Ranges {
    public static void main(String[] args) {
        int[] data = {36, 12, 25, 19, 46, 31, 22}; // create the array

        int rangeOfData = range(data); // send data array as arguement 
        System.out.print("The range of " + Arrays.toString(data) + " is " );
        System.out.println(+ rangeOfData);
    }

    public static int range(int[] data) {
        int max = data.length - 1; // accounting for 0 index, max equals length - 1   
        Arrays.sort(data); // sort array: min - max 
        return (data[max] - data[0] + 1);
    }
}

/* Exercise 3: Write a method called countInRange that accepts an array of 
 * integers, a min value and a max value as parameters and returns the count 
 * of how many elements from the array fall between the minimum and maximum
 * (inclusive). 
 *
 * Author : Wali Morris 
 * File   : CountRange.java
 * Date   : 02/01/2020
 */

import java.util.*;

public class CountRange {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] data = {14, 1, 22, 17, 36, 7, -43, 5}; // create array
        intro();
        System.out.print("Chose your minimum: ");
        int min = console.nextInt();
        System.out.print("Chose your maximum: ");
        int max = console.nextInt();
        int rangeCount = countInRange(data, min, max);
        System.out.print("How many numbers in this array fall between " + min);
        System.out.println(" and " + max + ": " + rangeCount);

    }

    public static void intro() {
        System.out.println("An array: 14, 1, 22, 17, 36, 7, -43, 5.");
        System.out.println("Choose two numbers, a maximum and a minimum.");
        System.out.println("Returned will be the count of elements in this array that");
        System.out.println("fall between your chosen numbers.");
    }

    public static int countInRange(int[] data, int min, int max) {
        int count = 0;
        int dataLength = data.length - 1;
        for(int i=0;i<dataLength;i++) {
            if(data[i] >= min && data[i] <= max) {
                count++;
            }
        }
        return count;
    }
}
