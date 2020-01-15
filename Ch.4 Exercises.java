/* Write a method called fractionSum that accepts an integer parameter n and 
 * returns as a double the sum of the first n terms of the sequence. You may
 * assume that the parameter n is non negative.
 *
 * Author : Wali Morris
 * File   : FractionSums.java
 * Date   : 01/13/2020 
 */

public class FractionSums {
    public static void main(String[] args) {
        double sum = fractionSum(8);
        System.out.printf("sum = %f\n", sum);
    }

    public static double fractionSum(int n) {
        double sum = 1.0;
        for(double i=2.0;i<=n;i++) {
            sum += 1.0/i;
        }

        return sum;
    }
}

/* Write a method called repl that accepts a String and a number of repetitions
 * as parameters and returns the String concatenated that many times.
 *
 * Author : Wali Morris
 * File   : Replace.java
 * Date   : 01/13/2020
 */

public class Replace {
    public static void main(String[] args) {
        String repeatHello = repl("Hello", 3);
        System.out.println(repeatHello);
    }

    public static String repl(String s, int x) {
        String finalStr = "";
        for(int i=1;i<=x;i++) {
            finalStr += s;
        }

        return finalStr;
    }
}

/* Write a method called daysInMonth that takes a month(an integer between 1 
 * and 12) as a parameter and returns the number of days in that month in this
 * year. Assume the code is not being run during a leap year. 
 *
 * Author : Wali Morris
 * File   : Days.java
 * Date   : 01/13/2020
 */

public class Days {
    public static void main(String[] args) {
        int jan = daysInMonth(1);
        int jun = daysInMonth(6);
        System.out.printf("The number of days in January: %d", jan);
        System.out.printf("\nThe number of days in June: %d\n", jun);
    }

    //pre: months must be between 1 - 12, throws IllegalArguementException if not 
    public static int daysInMonth(int m) {
        int numberOfDays = 31;
        if(m < 1 || m > 12) {
            throw new IllegalArgumentException("month must be 1 - 12");
        } else if(m == 2) {
            numberOfDays = 28;
            return numberOfDays;
        } else if(m == 4 || m == 6 || m == 9 || m == 11 ) {
            numberOfDays = 30;
            return numberOfDays;
        } else {
            return numberOfDays;
        }
    }
}

/* Write a method called printRange that accepts two integers as arguements and 
 * prints the sequence of numbers between the two arguements, seperated by 
 * spaces. Print an increasing sequence if the first arguement is smaller than
 * the second; otherwise, print a decreasing sequence. If the two numbers are 
 * the same, that number should be printed by itself. 
 *
 * Author : Wali Morris
 * File   : PrintingRange.java
 * Date   : 01/13/2020
 */

public class PrintingRange {
    public static void main(String[] args) {
        printRange(2, 7);
        printRange(5, 5);
        printRange(23, 43);
        printRange(43, 23);
    }

    public static void printRange(int x, int y) {
        if(x < y) {
            for(int i=x;i<=y;i++) {
            System.out.print(i + " ");
        }
        //ends first if statement's print() 
        System.out.println();

        } else if(x > y) {
            for(int i=x;i>=y;i--) {
                System.out.print(i + " ");
        }
        //ends else if statement's print()
        System.out.println();

        } else {
            System.out.println(x);
        }
    }
}

/* Write a method called evenSumMax that accepts a Scanner for the console as a
 * parameter. The method should prompt the user for a number of integers, then
 * prompt the integer that many times. Once the user has entered all the integers, 
 * the method should print the sum of all the even numbers the user typed, along
 * with the largest even number typed. You may assume that the user will type at
 * least one nonnegative even number. 
 *
 * Author : Wali Morris 
 * File   : EvenSum.java
 * Date   : 01/14/2020
 */

import java.util.*;

public class EvenSum {
    public static void main(String[] args) {
        printIntro();

        Scanner console = new Scanner(System.in);
        evenSumMax(console);
    }

    public static void printIntro() {
        System.out.println("This program prompts for a number of times");
        System.out.println("you'll enter a single integer to the console.");
        System.out.println("Those integers will be summed and printed.");
    }

    public static void evenSumMax(Scanner console) {
        System.out.print("\nHow many integers would you like to enter? ");
        int counter = console.nextInt();
        int max = 0, sum = 0, num;
        for(int i=1;i<=counter;i++) {
            System.out.print("\nEnter a number: ");
            num = console.nextInt();
            if(num % 2 == 0) {
                sum += num;
            }
            if(num > max && num % 2 == 0) {
                max = num;
            }
        }

        System.out.printf("\nEven sum = %d , ", sum);
        System.out.printf("Even max = %d\n", max);
    }
}

/* Write a method called printGPA that accepts a scanner for the console as a 
 * parameter and calculates a students grade point average. The user will type
 * a line of input contaiing the student's name, then a number that represents
 * the number of scores, followed by that many integer scores. 
 *
 * Author : Wali Morris
 * File   : GPA.java
 * Date   : 01/14/2020
 */

import java.util.*;

public class GPA {
    public static void main(String[] args) {
        printIntro();

        Scanner console = new Scanner(System.in);
        printGPA(console);
    }

    public static void printIntro() {
        System.out.println("This program calculates a students GPA.");
        System.out.println("A user will enter their name followed by");
        System.out.println("the number of grades they want calculated.");
    }

    public static void printGPA(Scanner console) {
        System.out.print("\nEnter a student record(name): ");
        String name = console.nextLine();
        System.out.print("Enter number of grades to compute: ");
        int base = console.nextInt();
        System.out.print("Enter grade(percentage): ");
        double sum = console.nextInt();

        for(int i=1;i<=base-1;i++) {
            System.out.print("Enter grade(percentage): ");
            sum += console.nextInt();
        }

        double gpa = sum/base;
        System.out.printf("\n%s's grade is ", name);
        System.out.printf("%.1f%%\n", gpa);
    }
}
~ 
