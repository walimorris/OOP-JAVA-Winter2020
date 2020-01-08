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

/* Building Java Programs 5th Edition: Chapter 1 
 * Exercise 2: Write a complete program called 
 * Spikey that prints the output in this solution.
 * 
 * Author: Wali Morris 
 * file  : Spikey.java 
 * date  : Jan 07, 2019 
 */

public class Spikey { 
    public static void main(String[] args) { 
        drawSpikeBall(); 
    } 

    public static void drawSpikeBall() { 
        System.out.println("   \\/"); 
	System.out.println("  \\\\//"); 
	System.out.println(" \\\\\\///");
	System.out.println(" ///\\\\\\"); 
	System.out.println("  //\\\\"); 
	System.out.println("   /\\"); 	
    } 
}

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

/* Building Java Programs 5th Edition: Chapter 1 
 * Exercise 4: Write a complete program called 
 * Difference that prints the output in this solution.
 * 
 * Author: Wali Morris 
 * file  : Differece.java 
 * date  : Jan 07, 2019 
 */

public class Difference { 
    public static void main(String[] args) { 
        differenceText(); 
    } 

    public static void differenceText() { 
        System.out.println("What is the difference between"); 
	System.out.println("a ' and a \"? Or between a \" and a \\\"?");
        System.out.println("One is what we see when we're typing our program."); 
	System.out.println("the other is what appears on the \"console.\""); 	
    } 
} 
