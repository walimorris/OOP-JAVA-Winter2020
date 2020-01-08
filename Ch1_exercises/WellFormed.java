/* Building Java Programs 5th Edition: Chapter 1 
 * Exercise 3: Write a complete program called 
 * Wellformed that prints the output in this solution.
 * 
 * Author: Wali Morris 
 * file  : Wellformed.java 
 * date  : Jan 07, 2019 
 */

public class WellFormed { 
    public static void main(String[] args) { 
        WellFormedText(); 
    } 

    public static void WellFormedText() { 
        System.out.println("A well-formed Java program has\na main method with { and }\nbraces.\n"); 
	System.out.println("A System.out.println statement\nhas ( and ) and usual a"); 
	System.out.println("string that starts and ends\nwith a \"character."); 
	System.out.println("(But we type \\\" instead!)"); 
    } 
} 

