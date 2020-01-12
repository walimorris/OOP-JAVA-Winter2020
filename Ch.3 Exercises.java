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
