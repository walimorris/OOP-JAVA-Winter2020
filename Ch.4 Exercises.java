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
~ 
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
