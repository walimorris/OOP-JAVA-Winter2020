// Chapter 6 introduces file/data manipulation. 

/* Introduction: This short program is an intro to file manipulations using
 * Java.
 *
 * Author : Wali Morris 
 * File   : TestFile.java
 * Date   : 01/26/2020
 */

import java.util.*;
import java.io.*;

public class TestFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("testfile.txt"));
        int count = 0;
        while(input.hasNext()) {
            String word = input.next();
            System.out.println(word);
            count++;
        }
        System.out.printf("This file contains: %d words\n", count);
    }
}

/* Exercise 1: Write a method called boyGirl that accepts a Scanner that is 
 * reading its input from a file containing a series of names followed by 
 * integers. The names alternate boys' names and girls' names. Your method 
 * should compute the absolute difference between the sum of boys' integers
 * and the sum of the girls' integers. The input could end with either a boy
 * or girl; you may not assume that it contains an even number of names. 
 *
 * Author : Wali Morris
 * File   : BoysGirlsName.java 
 * Date   : 01/27/2020
 */

import java.util.*;
import java.io.*;

public class BoysGirlsName {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("BoysGirlsName.txt"));

        while(input.hasNextLine()) {
            String text = input.nextLine();
            processLine(text);
        }
    }
    /* This function is passed one parameter, a line of text. The first piece of text read 
     * is a name, followed by an integer. It's decided if the name is a boy name or girl 
     * name. We know boys are first, so the first name and its integer goes to the sum of 
     * boys. Every other name must be a girls name and so its integer goes to the sum of girls.
     * The absolute difference of the boy and girl integers is printed to the console. 
     */
    public static void processLine(String text) {
        Scanner data = new Scanner(text);

        int boysSum = 0;
        int girlsSum = 0;
        int sum = 0;
        while(data.hasNext()) {
            String name = data.next();
            System.out.print(name + "(boy): ");
            int boys = data.nextInt();
            System.out.println(boys);
            boysSum += boys;
            /* Atleast one name exists, but names may be odd so in this case we must scan ahead
             * to ensure a name exists' and it's the eof. If it's the end of file, we must stop reading.
             */
            if(data.hasNext()) {
                name = data.next();
                System.out.print(name + "(girl): ");
                int girls = data.nextInt();
                System.out.println(girls);
                girlsSum += girls;
            }
        }
        System.out.println("Boys sum: " + boysSum);
        System.out.println("Girls sum: " + girlsSum);
        System.out.println("Absolute difference: " + Math.abs(boysSum - girlsSum));
    }
}

/* Exercise 2: Write a method called evenNumbers that accepts a Scanner reading
 * input from a file with a series of integers, and report various statistics 
 * about the integers to the console. Report the total number of numbers, the 
 * sum of the numbers, the count of even numbers and the percent of even numbers. 
 *
 * Author : Wali Morris
 * File   : EvenNumbers.java
 * Date   : 01/27/2020
 */

import java.util.*;
import java.io.*;

public class EvenNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("evennumbers.txt"));

        evenNumbers(input);
    }

    public static void evenNumbers(Scanner input) {
        int count = 0, sum = 0, evens = 0, next = 0;
        double evenPercentage = 0.0;
        while(input.hasNextInt()) {
            next = input.nextInt();
            sum += next;
            count++;
            if(next % 2 == 0) {
                evens++;
            }
        }
        /* use double here in order to get the values 
         * of even and count as double, rather than int.
         */
        evenPercentage = (double) evens/count * 100;
        System.out.print("Total Numbers: " + count);
        System.out.println(", Sum: " + sum);
        System.out.print("Even numbers: " + evens);
        System.out.printf(" (%.2f)\n", evenPercentage);
    }
}

/* Exercise 3: Write a method called negativeSum that accepts a Scanner 
 * reading input from a file containing a series of integers, and print
 * a message to the console indicating whether the sum starting from the
 * first number is ever negative. You should also return true if a negative
 * sum can be reached and false if not. 
 *
 * Author : Wali Morris
 * File   : NegativeSum.java
 * Date   : 01/27/2020
 */

import java.util.*;
import java.io.*;

public class NegativeSum {
    public static void main(String[] args) throws FileNotFoundException {
        /* This file contains: -38 4 19 -27 -15 -3 4 19 38
         * and will return "Sum of -38 after 0 steps" true.
         */
        Scanner input = new Scanner(new File("negativesum.txt"));

        boolean argSum = negativeSum(input);
        System.out.println(argSum);
    }

    public static boolean negativeSum(Scanner input) {
        int next = 0, sum = 0, count = 0;
        while(input.hasNextInt()) {
            next = input.nextInt();
            sum += next;
            if(sum < 0) {
                System.out.println("sum of " + sum + " after " + count + " steps");
                return true;
            }
        }
        System.out.println("No negative sum");
        return false;
    }
}

/* Exercise 4: Write a method called countCoins that accepts a Scanner representing 
 * an input file whose data is a series of pairs of tokens, where each pair begins 
 * with an integer and is followed by the type of coin, which will be "pennies"(1cent)
 * "nickels"(5cents), "dimes"(10cents), or "quarters"(25cents), case insensitively. 
 * Add up the cash values of all the coins and print the total money. 
 *
 * Author : Wali Morris 
 * File   : CountCoins.java
 * Date   : 01/28/2020
 */

import java.util.*;
import java.io.*;

public class CountCoins {
    public static void main(String[] args) throws FileNotFoundException {
        // contains: 3 pennies 2 quarters 1 Pennies 23 NickeLs 4 DIMES 
        Scanner input = new Scanner(new File("monies.txt"));

        while(input.hasNextLine()) {
            String text = input.nextLine();
            countCoins(text);
        }
    }

    /* This function reads a file, first the count then the currency of the count
     * and adds the running sum.
     */
    public static void countCoins(String text) {
        Scanner data = new Scanner(text);

        String currencyToken = " ";
        String currency = " ";
        int value = 0;
        double sum = 0;
        while(data.hasNextInt()) {
            value = data.nextInt(); // get next count   
            System.out.println(value);
            currencyToken = data.next();  // get the currency
            currency = currencyToken.toLowerCase(); // ensure case insensitivity
            System.out.println(currency);

            if(currency.equals("pennies")) {
                sum += value * .01;
            } else if(currency.equals("nickels")) {
                sum += value * .05;
            } else if(currency.equals("dimes")) {
                sum += value * .10;
            } else if(currency.equals("quarters")) {
                sum += value * .25;
            } else {
                System.out.print("[Error!] This currency " + currency);
                System.out.println(" is not recognized: please review file.");
            }
            System.out.printf("Sum: $%.2f\n", sum);
        }
        System.out.printf("The total value of all currency: $%.2f\n", sum);
    }
}
