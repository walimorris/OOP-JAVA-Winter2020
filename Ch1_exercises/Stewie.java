/* Building Java Programs 5th Edition: Chapter 1 
 * Exercise 1: Write a complete program called 
 * Stewie that prints the output in this solution.
 * 
 * Author: Wali Morris 
 * file  : Stewie.java 
 * date  : Jan 07, 2019 
 */
 

public class Stewie { 
    public static void main(String[] args) { 
        drawVictoryBox(); 
    } 

    /* Utilizing print() allows for line continuation which should be closed 
     * with println(). This way backslash escape doesn't extend so far*/ 
    public static void drawVictoryBox() { 
        System.out.println("//////////////////////"); 	
	System.out.println("|| Victory is mine! ||");
	System.out.print("\\\\\\\\\\\\\\\\\\\\\\"); 
	System.out.println("\\\\\\\\\\\\\\\\\\\\\\"); 
    }
}
