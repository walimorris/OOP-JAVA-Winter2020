// Chapter 4: Conditionals 

/* Exercise 1: Write a method called fractionSum that accepts an integer parameter 
 * n and returns as a double the sum of the first n terms of the sequence. You may
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

/* Exercise 2: Write a method called repl that accepts a String and a number
 * of repetitions as parameters and returns the String concatenated that many
 * times.
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
        String finalStr = ""; // initialize empty string
        for(int i=1;i<=x;i++) {
            finalStr += s; // for every loop write string to final
        }

        return finalStr;
    }
}

/* Exercise 3: Write a method called season that takes as parameters two 
 * integers representing a month and day and returns a String indicating 
 * the season for that month and day. Assume that the month is specified 
 * as an integer between 1 and 12 and the day of month is a number 1 and 
 * 31. If the date falls between 12/16 and 3/15, the method should return 
 * "winter". If the date falls between 3/16 and 6/15, the method should 
 * return "spring". If the date falls between 6/16 and 9/15, the method 
 * should return "summer" and if the date falls between 9/16 and 12/15, 
 * the method should return "fall". 
 *
 * Author : Wali Morris 
 * File   : Seasons.java
 * Date   : 01/13/2020
 */

public class Seasons {
    public static void main(String[] args) {
        // A few tests
        String season1 = season(12,16); // winter       
        String season2 = season(1, 22); // winter 
        String season3 = season(3, 15); // winter
        String season4 = season(3, 16); // spring
        String season5 = season(4, 2);  // spring 
        String season6 = season(6, 15); // spring 
        String season7 = season(6, 16); // summer 
        String season8 = season(7, 31); // summer
        String season9 = season(9, 15); // summer
        String season10 = season(9, 16); // fall 
        String season11 = season(10, 31); // fall 
        String season12 = season(12, 15); // fall 
        System.out.println("12/16: " + season1); // pass 
        System.out.println("01/22: " + season2); // pass
        System.out.println("03/15: " + season3); // pass
        System.out.println("03/16: " + season4); // pass
        System.out.println("04/02: " + season5); // pass
        System.out.println("06/15: " + season6); // pass
        System.out.println("06/16: " + season7); // pass
        System.out.println("07/31: " + season8); // pass
        System.out.println("09/15: " + season9); // pass
        System.out.println("09/16: " + season10);// pass
        System.out.println("10/31: " + season11);// pass
        System.out.println("12/15: " + season12);// pass        
    }
    /* This method takes two arguments(month and day) which is assisted
     * by a helper function to determine what season of the year the 
     * month and day represent. The month and day passed to season is 
     * also passed to each helper function and returns true if its values
     * represent 
     */
    public static String season(int month, int day) {
        if(month > 12 && day > 31) {
            throw new IllegalArgumentException("The date input is out of range");
        } else if(isWinter(month, day)) {
            return "winter";
        } else if(isSpring(month, day)) {
            return "Spring";
        } else if(isSummer(month, day)) {
            return "Summer";
        } else {
            return "Fall";
        }
    }
    
    /* This helper function evaluates two parameters(month and day) to determine
     * if the integer month and integer day falls within its certain season. 
     * isWinter falls within 12/16 - 3/15
     */
    public static boolean isWinter(int month, int day) {
        boolean startWinter = month == 12 && day >= 16
                && day <= 31;
        boolean thruWinter = month == 1 || month == 2 && day >= 1
                && day <= 31;
        boolean endWinter = month == 3 && day >= 1 && day <= 15;
        if(startWinter || thruWinter || endWinter) {
            return true;
        }
        return false;
    }
    
    /* This helper function evaluates two parameters(month and day) to determine
     * if the integer month and integer day falls within its certain season. 
     * isSpring falls within 3/16 - 6/15
     */
    public static boolean isSpring(int month, int day ) {
        boolean startSpring = month == 3 && day >= 16
                && day <= 31;
        boolean thruSpring = month == 4 || month == 5 && day >= 1
                && day <= 31;
        boolean endSpring = month == 6 && day >= 1 && day <= 15;
        if(startSpring || thruSpring || endSpring) {
            return true;
        }
        return false;
    }

    /* This helper function evaluates two parameters(month and day) to determine
     * if the integer month and integer day falls within its certain season.
     * isSummer falls within 6/16 - 9/15
     */
    public static boolean isSummer(int month, int day) {
        boolean startSummer = month == 6 && day >= 16
                && day <= 31;
        boolean thruSummer = month == 7 || month == 8 && day >= 1
                && day <= 31;
        boolean endSummer = month == 9 && day >= 1 && day <= 15;
        if(startSummer || thruSummer || endSummer) {
            return true;
        }
        return false;
    }
    
    /* This helper function evaluates two parameters(month and day) to determine
     * if the integer month and integer day falls within its certain season.
     * isFall falls within 9/16 - 12/15
     */
    public static boolean isFall(int month, int day) {
        boolean startFall = month == 9 && day >= 16
                && day <= 31;
        boolean thruFall = month == 10 || month == 11 && day >= 1
                && day <= 31;
        boolean endFall = month == 12  && day >= 1 && day <= 15;
        if(startFall || thruFall || endFall) {
            return true;
        }
        return false;
    }
}

/* Exercise 4: Write a method called daysInMonth that takes a month(an integer 
 * between 1 and 12) as a parameter and returns the number of days in that month
 * in this year. Assume the code is not being run during a leap year. 
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

/* Exercise 6: Write a method called printRange that accepts two integers as 
 * arguements and prints the sequence of numbers between the two arguements, 
 * seperated by spaces. Print an increasing sequence if the first arguement 
 * is smaller than the second; otherwise, print a decreasing sequence. If the 
 * two numbers are the same, that number should be printed by itself. 
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

/* Exercise 9: Write a method called evenSumMax that accepts a Scanner for the 
 * console as a parameter. The method should prompt the user for a number of 
 * integers, then prompt the integer that many times. Once the user has entered 
 * all the integers, the method should print the sum of all the even numbers the 
 * user typed, along with the largest even number typed. You may assume that the
 * user will type at least one nonnegative even number. 
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
            } else if(num > max && num % 2 == 0) {
                max = num; 
            }
        }

        System.out.printf("\nEven sum = %d , ", sum);
        System.out.printf("Even max = %d\n", max);
    }
}

/* Exercise 10: Write a method called printGPA that accepts a scanner for the 
 * console as a parameter and calculates a students grade point average. The 
 * user will type a line of input containing the student's name, then a number 
 * that represents the number of scores, followed by that many integer scores. 
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
        String name = console.nextLine(); // get the students name 
        System.out.print("Enter number of grades to compute: ");
        int base = console.nextInt(); // get numbers of grades student would like to input 
        System.out.print("Enter grade(percentage): "); 
        double sum = console.nextInt(); 
        
        // loop until the user's desired numbers of grade inputs are met.
        for(int i=1;i<=base-1;i++) { 
            System.out.print("Enter grade(percentage): ");
            sum += console.nextInt(); // add percentage every loop to itself
        }

        double gpa = sum/base; // divide total percent by number of grades given
        System.out.printf("\n%s's grade is ", name); 
        System.out.printf("%.1f%%\n", gpa); // compute student's grade to 1 decimal point
    }
}
~ 
/* Write a method called smallestLargest that accepts a Scanner for the console
 * as a parameter and asks the user to enter numbers, then prints the smallest 
 * and largest of all the numbers supplied by the user. You may assume that the
 * user enters a valid number greater than 0 for the number of numbers to read
 *
 * Author : Wali Morris 
 * File   : SmallestLargest.java
 * Date   : 01/15/2020 
 */

import java.util.*;

public class SmallestLargest {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        smallestLargest(console);
    }

    public static void smallestLargest(Scanner console) {
        System.out.print("How many integers to write: ");
        int base = console.nextInt();
        while(base<2) {
            System.out.println("Please enter a number greater than 1.");
            System.out.print("How many integers to write: ");
            base = console.nextInt();
        }

        System.out.print("number 1: ");
        int max = console.nextInt();
        int min = max;
        /* This for loop drives the decision between smallest and largest. 
         * max is initialized by user decision and min is initialized as max. 
         * The next number is chosen and if its greater than min/max that number 
         * becomes max, if it's lower it becomes min. Every number and loop 
         * after can now be compared to the current min and max num. 
         */
        for(int i=2;i<=base;i++) {
            System.out.print("number " + i + ": ");
            int num = console.nextInt();
            if(num>=max) {
                max = num;
            } else if(num<=min) {
                min = num;
            }
         }
         System.out.printf("Smallest: %d\n", min);
         System.out.printf("Largest : %d\n", max);
    }
}

/* Write a method called longestName that accepts a Scanner for the console 
 * and an integer n as parameters and prompts for n names, then prints the 
 * longest name (the name that contains the most characters). 
 *
 * Author : Wali Morris
 * File   : LongestName.java
 * Date   : 01/15/2020
 */

import java.util.*;

public class LongestName {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        console.useDelimiter("\\n");

        int numberOfNames = inputNames(console);
        longestName(console, numberOfNames);
    }

    public static int inputNames(Scanner console) {
        System.out.print("How many names to enter: ");
        int numberOfNames = console.nextInt();
        while(numberOfNames < 2) {
            System.out.println("Please choose atleast 2 names.");
            System.out.print("How many names to enter: ");
            numberOfNames = console.nextInt();
        }

        return numberOfNames;
    }

    public static void longestName(Scanner console, int numberOfNames) {
        String longestName = "";
        int longestNameValue = longestName.length();
        for(int i=1;i<=numberOfNames;i++) {
            System.out.print("name #" + i + ": ");
            /* initializing delimiter with console ends user input
             * after pressing enter with endline \n and allows the 
             * use of next() rather than nextLine()
             */
            String currentName = console.next();
            int currentNameValue = currentName.length();
            if(currentNameValue > longestNameValue) {
                longestName = currentName;
                longestNameValue = currentNameValue;
            }
        }

        System.out.println("Longest name is: " + longestName);
    }
}

/* Write a method called printTriangleTypes. This method accepts three integer
 * arguments representing the lengths of the sides of a triangle and prints 
 * the type of triangle that these sides form. The three types are: 
 * isosceles, equilateral, scalene. 
 *
 * Author : Wali Morris
 * File   : TriangleTypes.java
 * Date   : 01/16/2020
 */

public class TriangleTypes {
    public static void main(String[] args) {
            String triangle1 = printTriangleType(5, 7, 7);
            String triangle2 = printTriangleType(6, 6, 6);
            String triangle3 = printTriangleType(5, 7, 8);

            System.out.println("triangle1 type: " + triangle1);
            System.out.println("triangle2 type: " + triangle2);
            System.out.println("triangle3 type: " + triangle3);
    }

    /* This method takes 3 intergers(x,y,z). Each integer represents
     * each side of a triangle and returns a String of its type 
     * dependant on the length of each side.
     */
    public static String printTriangleType(int sideX, int sideY, int sideZ) {
        String triangleType = "isosceles";
        if(sideX > sideY + sideZ || sideY > sideX + sideZ || sideZ > sideX + sideY) {
            throw new IllegalArgumentException("One side is greater than the sum of the other two.");
        } else if(sideX == sideY && sideY == sideZ) {
            return "equilateral"; // all sides are equal  
        } else if(sideX != sideY && sideX != sideZ && sideY != sideZ) {
            return "scalene"; // all sides are unequal
        } else {   
            /* if neither all sides are unequal or equal, it must be that one side is either 
             * equal to another thats unequal to the last and by default is an isoceles.
             */
            return triangleType;
        }
    }
}

/* Write a method called average that takes two integers as parameters and 
 * returns the average of the two integers
 *
 * Author : Wali Morris 
 * File   : Average.java
 * date   : 01/16/2020
 */

public class Average {
    public static void main(String[] args) {
        double average1 = average(16, 32);
        double average2 = average(17, 18);
        System.out.println("The Average of 16 and 32: " + average1);
        System.out.println("The Average of 17 and 18: " + average2);
    }
    /* This method takes two integers and returns a double 
     * in order to return a more exact value for their
     * average
     */
    public static double average(int num1, int num2) {
        return ((double)num1 + (double)num2) / 2;
    }
}

/* Write a method called getGrade that accepts an integer representing 
 * a student's grade in a course and returns that student's numerical 
 * course grade. The grade can be between 0.0(failing) and 4.0(perfect).
 * Assume the scores are in the range 0 to 100. 
 *
 * Author : Wali Morris
 * File   : GradeScale.java
 * Date   : 01/16/2020
 */

import java.util.*;

public class GradeScale {
    /* These class constants represent university grading scale. These
     * values are used to initialize variables in the below for loop and
     * decision structure. Max Score is 100, though on the GPA scale, 
     * a 95,96,97,98 or 99 is no different than a 100.
     */
    public static final double MAX_GPA = 4.0;
    public static final int MAX_SCORE = 94;

     public static void main(String[] args) {
         Scanner console = new Scanner(System.in);

         System.out.print("Enter course score: ");
         int courseScore = console.nextInt();
         double courseGrade = getGrade(courseScore);
         System.out.printf("course grade: %.1f\n", courseGrade);
     }

     public static double getGrade(int score) {
         //pre: score must be >=0 or <=100 else IllegalArgumentException is thown 
         if(score < 0 || score > 100) {
             throw new IllegalArgumentException("Score must be >= 0 or <= 100 " + score);
         } else if(score < 60) { // special case: any score less than 60 but greater than 0  
             return 0.0;
         } else if(score >=60 && score <= 62) { // special case: score of 60 - 62
             return 0.7;
         } else if(score >= 95) { // special case: score of 95 and greater 
             return 4.0;
         } else {
             /* if the score is not a special case we initialize finalGPA as MAX_GPA
              * and finalScore as MAX_SCORE. This allows the for loop to decrement 
              * finalGPA and subtract the MAX_GPA by .1 until finalGPA matches the 
              * score(which is lower), the score will represent its GPA. 
              */
             double finalGPA = MAX_GPA;
             int finalScore = MAX_SCORE;
             for(int i=finalScore;score<=i;i--) {
                 finalGPA -= .1;
             }
             return finalGPA;
         } 
     } 
} 

/* Write a method called getGrade that accepts an integer representing 
 * a student's grade in a course and returns that student's numerical 
 * course grade. The grade can be between 0.0(failing) and 4.0(perfect).
 * Assume the scores are in the range 0 to 100. 
 *
 * Author : Wali Morris 
 * File   : SuperGradeScale.java
 * Date   : 01/16/2020
 */

import java.util.*;

public class SuperGradeScale {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter course score: ");
        int courseScore = console.nextInt();
        double courseGrade = getGPA(courseScore);
        System.out.printf("course grade: %.1f\n", courseGrade);
    }
    /* GPA is calculated using the algebraic expression (score * .1) - 55
     * special cases such as a score lower than 60 andscore greater than 95 
     * can be quickly computed, other the formula above is used. 
     */
    public static double getGPA(int score) {
        //pre: score must be >=0 or <=100 else IllegalArgumentException is thown 
         if(score < 0 || score > 100) {
             throw new IllegalArgumentException("Score must be >= 0 or <= 100 " + score);
         } else if(score < 60) { // special case: any score less than 60 but greater than 0  
             return 0.0;
         } else if(score >=60 && score <= 62) { // special case: score of 60 - 62
             return 0.7;
         } else if(score >= 95) { // special case: score of 95 and greater 
             return 4.0;
         } else {
             return (score * .1) - 5.5;
         }
    }
}

/* Exercise 16: Write a method called isPalindrome that accepts a Scanner 
 * for the console as a parameter, prompts the user to enter one or more 
 * words, and prints whether the entered String is a palindrome.  
 *
 * Author : Wali Morris 
 * File   : Palindrome.java 
 * Date   : 01/17/2020 
 */

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        isPalindrome(console);
    }

    public static void isPalindrome(Scanner console) {
        System.out.print("Enter a word: ");
        String wordToEvaluate = console.nextLine();
        String wordReversed = "";
        int wordLength = wordToEvaluate.length() - 1;
        for(int i=wordLength;i>=0;i--) {
            wordReversed += wordToEvaluate.charAt(i);
        }

        if(wordReversed.toLowerCase().equals(wordToEvaluate.toLowerCase())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

/* Write a method called stutter that accepts a string parameter and returns 
 * that string with its characters repeated twice. 
 *
 * Author : Wali Morris 
 * File   : Stutters.java
 * Date   : 01/17/2020 
 */

public class Stutters {
    public static void main(String[] args) {
        String var1 = stutters("coconuts!!");
        String var2 = stutters("pineapples!");
        System.out.println(var1);
        System.out.println(var2);
    }

    public static String stutters(String word) {
        String newVar = "";
        for(int i=0;i<=word.length()-1;i++) {
            for(int j=0;j<2;j++) {
                newVar += word.charAt(i);
            }
        }

        return newVar;
    }
}

/* Exercise 19: Write a method called quadrant that accepts as parameters a pair
 * of double values representing and (x,y) point and returns the quadrant number
 * for that point. If the point falls on x or y axis, return 0. 
 *
 * Author : Wali Morris 
 * File   : Quadrants.java
 * date   : 01/17/2020
 */

public class Quadrants {
    public static void main(String[] args) {
        int point1 = quadrant(-1.0, 2.0);
        int point2 = quadrant(0.0, 0.0);
        int point3 = quadrant(8.0, 9.0);

        /* if point x or y is 0, the point lies on the x or y 
         * axis, so return 0. test: should all return 0.
         */
        int point4 = quadrant(0.0, -9.0);
        int point5 = quadrant(5.4, 0.0);
        int point6 = quadrant(-11.2, 0.0);
        int point7 = quadrant(0.0, 6.5);
        System.out.printf("point 1: %d\n", point1);
        System.out.printf("point 2: %d\n", point2);
        System.out.printf("point 3: %d\n", point3);
        System.out.printf("point 4: %d\n", point4);
        System.out.printf("point 5: %d\n", point5);
        System.out.printf("point 6: %d\n", point6);
        System.out.printf("point 7: %d\n", point7);
    }

    public static int quadrant(double x, double y) {
        if(x > 0 && y > 0) { //positive,positive: Quadrant 1
            return 1;
        } else if(x > 0 && y < 0) { //positve,negative: Quadrant 4
            return 4;
        } else if(x < 0 && y > 0) { //negative, positive: Quadrant 2
            return 2;
        } else if(x < 0 && y < 0) { // negative, negative: Quadrant 3
            return 3;
        } else { //either point x or y is 0, point falls on x or y axis 
            return 0;
        }
    }
}
