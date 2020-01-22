//Chapter 3 does a dive into the Java Math library, methods, parameters and objects! 

/* Warmup: Write a method that write a certain number or space. 
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

/* Warm up: This program determines the amount of coffee a person drinks weekly; 
 * depending on the number of coffees consumed each day by the number of days in 
 * a week.
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

/* Exercise 1: Write a method called printNumbers that accepts a maximum 
 * number as an argument and prints each number from 1 up to that maximum,
 * inclusive, boxed by squared brackets.
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

/* Exercise 2: Write a method called printPowersOf2 that accepts a maximum 
 * numbers as an arguement and prints each power of 2 from 2^0(1) up to that
 * maximum power inclusive. 
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

    public static void printPowersOf2(int n) {
        for(int i=0;i<=n;i++) {
            System.out.print((int)Math.pow(2,i)+" ");
        }

        System.out.println();
    }
}

/* Exercise 3: Write a method called printPowersOfN that accepts a base and an 
 * exponent as arguments and prints each power of the base from base^0(1) up to
 * that maximum power, inclusive. Solution without using Math class follows this 
 * exercise below. 
 *
 * Author : Wali Morris
 * Date   : 01/21/2020
 * File   : PowersOfN.java 
 */

public class PowersOfN {
    public static void main(String[] args) {
        printPowersOfN(4, 3);
        printPowersOfN(5, 6);
        printPowersOfN(-2, 8);
    }

    public static void printPowersOfN(int base, int exponent) {
        for(int i=0;i<=exponent;i++) {
            System.out.print((int)Math.pow(base, i) + " ");
        }

        System.out.println();
    }
}

/* Exercise 3A: Without using the math class. Write a method called 
 * printPowersOfN that accepts a base and an exponent as arguments 
 * and prints each power of the base from base^0(1) up to that maximum 
 * power, inclusive. 
 *
 * Author : Wali Morris
 * Date   : 01/21/2020
 * File   : PowersOfN2.java 
 */

public class PowersOfN2 {
    public static void main(String[] args) {
        printPowersOfN(4, 3);
        printPowersOfN(5, 6);
        printPowersOfN(-2, 8);
        printPowersOfN(-4, 0);
    }

    public static void printPowersOfN(int base, int exponent) {
        if(base == 0) {
            throw new IllegalArgumentException("0 is undefined!");
        }

        System.out.print(1 + " "); //any base to the power of 0 = 1
        int sum = 1;
        for(int i=1;i<=exponent;i++) { //we can skip to exponent of 1
            sum *= base;
            System.out.print(sum + " ");
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
         } else {
             return (salary * hours);
         }
     }
}
    
/* Write a method called cylinderSurfaceArea that accepts a radius and height 
 * as parameters and returns the surface area of a cylinder with those 
 * dimensions. 
 *
 * Author : Wali Morris 
 * File   : CylinderSurfaceArea.java
 * Date   : 01/12/2020
 */

public class CylinderSurfaceArea {
    public static void main(String[] args) {
        double surfaceArea = cylinderSurfaceArea(3.0, 4.5);
        System.out.print("Surface area of a cylinder with ");
        System.out.print("radius 3.0 and height 4.5 = ");
        System.out.println(surfaceArea);
    }

    // r(radius) and h(height)
    public static double cylinderSurfaceArea(double r, double h) {
        return (2 * Math.PI * r * r) + (2 * Math.PI * r * h);
    }
}

/* Write a method called sphereVolume that accepts a radius as a parameter and 
 * returns the volume of a sphere with that radius. 
 *
 * Author : Wali Morris 
 * File   : VolumeOfASphere.java
 * Date   : 01/12/2020
 */

public class VolumeOfASphere {
    public static void main(String[] args) {
        double sphere = sphereVolume(2.0);
        System.out.print("A sphere with a radius of 2.0 = ");
        System.out.println(sphere);
    }

    /* For correct calculations we compute 4/3 as a double. Calculating 
     * 4/3 will result in a 1 due to java arthmetic, which is fine, but 
     * not the correct calculation. 
     */
    public static double sphereVolume(double r) {
        return (double)4/3 * Math.PI * Math.pow(r, 3);
    }
}

/* Write a method called triangleArea that accepts the three side lengths of a
 * triangle as parameters and returns the area of a triangle with those side 
 * lengths using Heron's formula. 
 *
 * Author : Wali Morris
 * File   : TriangleArea.java
 * Date   : 01/12/2020 
 */

public class TriangleArea {
    public static void main(String[] args) {
        double area = triangleArea(8, 5.2, 7.1);
        System.out.println("The area is " + area);
    }

    public static double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        return area;
    }
}

/* Write a method called vertical that accepts a string as its parameter and 
 * prints each letter of the string on seperate lines. 
 *
 * Author : Wali Morris 
 * File   : VericalLetters.java 
 * Date   : 01/12/2020
 */

public class VerticalLetters {
    public static void main(String[] args) {
        vertical("More Loops");
    }

    public static void vertical(String x) {
        for(int i=0;i<x.length();i++) {
            System.out.println(x.charAt(i));
        }
    }
}

/* Write a method called printReverse that accepts a string as its parameter 
 * and prints the characters in opposite order. 
 *
 * Author : Wali Morris
 * File   : ReverseStrings.java
 * Date   : 01/12/2020 
 */

public class ReverseStrings {
    public static void main(String[] args) {
        printReverse("Hello there, Java!");
    }

    /* initialize i as the length of the string -1, if the string
     * is "Hello there, Java!" then length is 18-1 or 17 to take 
     * in account that indexing starts at 0. Here, we start at the 
     * greatest character in the string and decrement by 1 to 0, in 
     * other words until we reach the first character in the string.
     */
    public static void printReverse(String s) {
        for(int i=s.length()-1;i>=0;i--) {
            System.out.print(s.charAt(i));
        }

        System.out.println();
    }
}

/* Write a method called printIndexed that accepts a string as its parameter 
 * and prints the string's characters in order followed by their indexes in 
 * reverse order. 
 *
 * Author : Wali Morris 
 * File   : Indexed.java
 * Date   : 01/13/2020 
 */

public class Indexed {
    public static void main(String[] args) {
        printIndexed("ZELDA");
    }

    public static void printIndexed(String s) {
        /* initialize length of string and a counter variable j. 
         * for Every loop the character at j will print, followed by 
         * the integer value of i, which is length of string - 1. 
         * We subtract 1 to make up for the fact that indexing 
         * starts at 0. Using 'i>=0' ensures that i will reach 0.
         */
        int str = s.length(), j = 0; 
        for(int i=str-1;i>=0;i--) {
            System.out.print(s.charAt(j));
            System.out.print(i);
            j++;
        }

        System.out.println();
    }
}
