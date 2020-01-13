/* Write a method that write a certain number or space. 
 *
 * Author : Wali Morris
 * File   : WriteSpaces.java
 * Date   : 01/11/2020
 */

public class WriteSpaces {
    public static void main(String[] args) {
        writeSpaces(10);
        System.out.println("a"); //used to test number of spaces created        
    }

    public static void writeSpaces(int x) {
        for(int i=1;i<=x;i++) {
            System.out.print(" ");
        }
    }
}

/* Introductory Example: This program determines the amount of coffee a person
 * drinks weekly; depending on the number of coffees consumed each day by the 
 * number of days in a week.
 *  
 * Author : Wali Morris 
 * File   : ReturnExample.java 
 * Date   : 01/11/2020
 */

public class ReturnExample {
    public static void main(String[] args) {
        int numOfCoffeesADay = 3, numOfDays = 7;
        int weeklyCoffee = coffeesAWeek(numOfCoffeesADay, numOfDays);
        System.out.println("Number of coffees consumed this week: " + weeklyCoffee);
    }

    public static int coffeesAWeek(int x, int y) {
        return x * y;
    }
}

/* Write a method called printNumbers that accepts a maximum number as an 
 * argument and prints each number from 1 up to that maximum, inclusive, 
 * boxed by squared brackets.
 *
 * Author : Wali Morris
 * File   : PrintingNumbers.java
 * Date   : 01/12/2020
 */

public class PrintingNumbers {
    public static void main(String[] args) {
        printNumbers(15);
        printNumbers(5);
    }

    public static void printNumbers(int x) {
        for(int i=1;i<=x;i++) {
            System.out.print("[" + i + "]" + " ");
        }

        System.out.println();
    }
}

/* Write a method called printPowersOf2 that accepts a maximum numbers as an 
 * arguement and prints each power of 2 from 2^0(1) up to that maximum power
 * inclusive. 
 *
 * Author : Wali Morris
 * File   : PrintingPowers.java
 * Date   : 01/12/2020
 */

public class PrintingPowers {
    public static void main(String[] args) {
        printPowersOf2(3);
        printPowersOf2(10);
    }

    public static void printPowersOf2(int x) {
        for(int i=0;i<=x;i++) {
            System.out.print((int)Math.pow(2,i)+" ");
        }

        System.out.println();
    }
}

/* Write a methods called printGrid that accepts two integers represetning a 
 * number of rows and columns and prints a grid of integers from 1 
 * (rows * columns) in column major order. 
 *
 * Author : Wali Morris 
 * File   : PrintingGrids.java
 * Date   : 01/12/2020
 */

public class PrintingGrids {
    public static void main(String[] args) {
        printGrid(4, 6);
        System.out.println();
        printGrid(5, 5);
    }

    public static void printGrid(int x, int y) {
        for(int i=1;i<=x;i++) {
            for(int j=i;j<=x*y;j+=x) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}

/* Write a method called largerAbsVal that takes two integers as parameters and
 * returns the larger of the two absolute values. A callof largerAbsVal(11,2) 
 * would return 11, and a call of largerAbsVal(4,-5) would return 5. 
 *
 * Author : Wali Morris 
 * File   : AbsoluteValues.java
 * Date   : 01/12/2020
 */

public class AbsoluteValues {
    public static void main(String[] args) {
        int largerVal = largerAbsVal(4, -5);
        System.out.println("Largest absolute value is: " + largerVal);
    }

    public static int largerAbsVal(int x, int y) {
        int absX = Math.abs(x), absY = Math.abs(y);
        int greatestVal = Math.max(absX, absY);
        return greatestVal;
    }
}

/* Write a method called quadratic that solves quadratic equations and prints
 * their roots. In this solution you can assume assume the equations have two 
 * real roots, although this is not always the case mathematically. 
 *
 * Author : Wali Morris
 * File   : Quadratics.java 
 * Date   : 01/12/2020
 */

public class Quadratics {
    public static void main(String[] args) {
        System.out.print("Equation1: ");
        quadratic(1,-7,12);
        System.out.print("Equation2: ");
        quadratic(1,3,2);
    }

    // How to return two statements?
    public static void quadratic(int a, int b, int c) {
        double discRoot1 = (-b - (b*b - 4*a*c)) / (2*a);
        double discRoot2 = (-b + (b*b - 4*a*c)) / (2*a);
        System.out.print("x1 = " + (int)discRoot1 + ", ");
        System.out.println("x2 = " + (int)discRoot2);
    }
}

/* Write a method called lastDigit that returns the last digit of an integer. 
 * This should work for negative numbers as well. 
 *
 * Author : Wali Morris 
 * File   : ReturningDigits.java
 * Date   : 01/12/2020
 */

public class ReturningDigits {
    public static void main(String[] args) {
        int digitOne = 1435, digitTwo = -716;
        int ansOne = lastDigit(digitOne), ansTwo = lastDigit(digitTwo);
        System.out.print("The last digit of ");
        System.out.println(+ digitOne + " is " + ansOne);
        System.out.print("The last digit of ");
        System.out.println(+ digitTwo + " is " + ansTwo);
    }

    public static int lastDigit(int x) {
        return Math.abs(x) % 10;
    }
}

/* Write a method called area that accepts as a parameter the radius of a 
 * circle and that returns the area of the circle. 
 *
 * Author : Wali Morris 
 * File   : AreaOfCircle.java
 * Date   : 01/12/2020
 */

public class AreaOfCircle {
    public static void main(String[] args) {
        double radius = 2.0;
        double circleArea = area(radius);
        System.out.print("The area of a circle with radius of " + radius);
        System.out.println(" is " + circleArea);
    }

    public static double area(double radius) {
        return ((Math.PI) * (radius * radius));
    }
}

/* Write a method called distance that accepts four integer coordinates x1,y1,
 * x2,y2 as parameters and computes the distance between(x1,y1) and (x2,y2) on 
 * the Cartesian plane. 
 *
 * Author : Wali Morris 
 * File   : ComputingDistance.java
 * Date   : 01/12/2020
 */

import java.util.*;

public class ComputingDistance {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double x1, x2, y1, y2;
        double distanceBetweenPoints;
        System.out.print("Enter x1: ");
        x1 = console.nextInt();
        System.out.print("Enter y1: ");
        y1 = console.nextInt();
        System.out.print("Enter x2: ");
        x2 = console.nextInt();
        System.out.print("Enter y2: ");
        y2 = console.nextInt();
        distanceBetweenPoints = distance(x1,x2,y1,y2);
        System.out.print("The distance between ");
        System.out.print("("+x1+","+y1+") and ");
        System.out.println("("+x2+","+y2+") = " + distanceBetweenPoints);
    }

    public static double distance(double x1, double x2, double y1, double y2) {
        return Math.sqrt((Math.pow(x2-x1,2)) + (Math.pow(y2-y1,2)));
    }
}

/* Write a method called scientific that accepts a real number base and an 
 * exponent as paramters and computes the base times 10 to the exponent, as
 * seen in scientific notation. 
 *
 * Author : Wali Morris 
 * File   : ScientificNotation.java
 * Date   : 01/12/2020 
 */

public class ScientificNotation {
    public static void main(String[] args) {
        double solutionOne = scientific(6.23, 5);
        double solutionTwo = scientific(1.9, -2);
        System.out.print("6.23 with an exponent of 5 produces ");
        System.out.println(solutionOne + " in scientific notation.");
        System.out.print("\n1.9 with an exponent of -2 produces ");
        System.out.println(solutionTwo + " in scientific notation.");
    }

    public static double scientific(double base, int exponent) {
        return base * Math.pow(10, exponent);
    }
    
/* Write a method called pay that accepts two parameters: a real number for a 
 * TA's salary, and an integer for the number of hours the TA worked this week.
 * The method should return how much money to pay the TA. 
 *
 * Author : Wali Morris 
 * File   : TaSalary.java
 * Date   : 01/12/2020
 */

public class TaSalary {
    public static final int MAX_HOURS = 8;

     public static void main(String[] args) {
         double assistantOnePay = pay(5.50, 6);
         double assistantTwoPay = pay(4.00, 11);
         System.out.println("First TA pay: $" + assistantOnePay);
         System.out.println("Second TA pay: $" + assistantTwoPay);
    }

     public static double pay(double salary, int hours) {
         if(hours > MAX_HOURS) {
             return (salary * MAX_HOURS) + ((salary * 1.5) * (hours - MAX_HOURS));
         }

         else
             return (salary * hours);
     }
}
    
    
