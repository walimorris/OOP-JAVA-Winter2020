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
 * file  : Difference.java 
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

/* Building Java Programs 5th Edition: Chapter 1 
 * Exercise 5: Write a complete program called 
 * Difference that prints the output in this solution.
 * 
 * Author: Wali Morris 
 * file  : MuchBetter.java 
 * date  : Jan 07, 2019 
 */

public class MuchBetter {
    public static void main(String[] args) {
        someBetterText();
    }

    public static void someBetterText() {
        System.out.println("A \"quoted\" String is\nmuch better if you learn");
        System.out.println("the rules of \"escape sequences\".\nAlso, \"\" represents an empty string.");
        System.out.println("Don't forget: use \\\" instead of \" !\n'' is not the same as \"");
    }
}

/* Building Java Programs 5th Edition: Chapter 1 
 * Exercise 4: Write a complete program called Meta
 * whose output is the text that would be the source 
 * code of a Java program that prints "Hello World!"
 * as its output.
 * 
 * Author: Wali Morris 
 * file  : Meta.java 
 * date  : Jan 07, 2019 
 */

public class Meta {
    public static void main(String[] args) {
      helloWorldText();
    }

    public static void helloWorldText() {
        System.out.println("public class HelloWorld {");
        System.out.println("    public static void main(String[] args) {");
        System.out.println("        System.out.println(\"Hello World!\");");
        System.out.println("    }");
        System.out.println("}");
    }
}
