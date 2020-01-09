/* Building Java Programs 5th Edition: Chapter 1 
 * Exercise 1: Write a complete program called 
 * Stewie that prints the output in this solution.
 * 
 * Author: Wali Morris 
 * file  : Stewie.java 
 * date  : Jan 07, 2020
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
 * date  : Jan 07, 2020
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
 * date  : Jan 07, 2020 
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
 * date  : Jan 07, 2020
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
 * date  : Jan 07, 2020 
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
 * Exercise 6: Write a complete program called Meta
 * whose output is the text that would be the source 
 * code of a Java program that prints "Hello World!"
 * as its output.
 * 
 * Author: Wali Morris 
 * file  : Meta.java 
 * date  : Jan 07, 2020
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

/* Building Java Programs 5th Edition: Chapter 1 
 * Exercise 7: Write a complete program called Mantra
 * That prints the following output in this solution. 
 * Use at least one static method besides main.
 * 
 * Author: Wali Morris 
 * file  : Mantra.java 
 * date  : Jan 08, 2020
 */

public class Mantra {
    public static void main(String[] args) {
        writeMantraText();
        System.out.println();
        writeMantraText();
    }

    public static void writeMantraText() {
        System.out.println("There's one thing every coder must understand:");
        System.out.println("The System.out.println command.");
    }
}

/* Building Java Programs 5th Edition: Chapter 1 
 * Exercise 8: Write a complete program called 
 * Stewie2 that prints the output in this solution.
 * Use at least one static method besides main.
 * 
 * Author: Wali Morris 
 * file  : Stewie2.java 
 * date  : Jan 08, 2020 
 */

public class Stewie2 {
    public static void main(String[] args) {
           forwardSlashRow();
           for(int i=0;i<5;i++){
               victoryBackSlash();
           }
    }

    public static void printVictoryText() {
        System.out.println("|| Victory is mine! ||");
    }

    public static void forwardSlashRow() {
        System.out.println("//////////////////////");
    }

    public static void backSlashRow() {
        System.out.print("\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\");
    }

    public static void victoryBackSlash() {
        printVictoryText();
        backSlashRow();
    }
}

/* Building Java Programs 5th Edition: Chapter 1 
 * Exercise 9: Write a complete program called 
 * Egg that displays the output in this solution.
 * 
 * Author: Wali Morris 
 * file  : Egg.java 
 * date  : Jan 08, 2020 
 */

public class Egg {
    public static void main(String[] args) {
        drawTopEgg();
        drawYoke();
        drawBottomEgg();
    }

    public static void drawTopEgg() {
        System.out.println("  _________");
        System.out.println(" /         \\");
        System.out.println("/           \\");
    }

    public static void drawYoke() {
        System.out.println(" -\"-'-\"-'-\"- ");
    }

    public static void drawBottomEgg() {
        System.out.println("\\           /");
        System.out.println(" \\_________/");
    }
}

/* Exercise 10: Modify the program from the previous exercise to become 
 * a new program Egg2 that displays the following output in this solution. 
 * Use static methods as appropriate. 
 * 
 * Author : Wali Morris
 * File   : Egg2.java 
 * Date   : 01/08/2020 
 */

public class Egg2 {
    public static void main(String[] args) {
        for(int i=0;i<2;i++){
            drawTopEgg();
            drawBottomEgg();
            drawYoke();
            System.out.println();
        }
        drawBottomEgg();
        System.out.println();
        drawTopEgg();
        drawYoke();
        drawBottomEgg();
    }

    public static void drawTopEgg() {
        System.out.println("  _________");
        System.out.println(" /         \\");
        System.out.println("/           \\");
    }

    public static void drawYoke() {
        System.out.println(" -\"-'-\"-'-\"- ");
    }

    public static void drawBottomEgg() {
        System.out.println("\\           /");
        System.out.println(" \\_________/");
    } 
} 

/* Exercise 11: Write a Java program called TwoRockets that generates 
 * the following output. Use static methods to show structure and 
 * eliminate redundancy in your solution. Note that there are two 
 * rocket ships next to each other. What redundancy can you eliminate
 * using static methods? What redundancy cannot be eliminated?
 *
 * Author : Wali Morris 
 * File   : TwoRockets.java
 * Date   : 01/08/2020 
 */

public class TwoRockets {
    public static void main(String[] args) {
        drawTri();
        drawBox();
        drawLabelBox();
        drawBox();
        drawTri();
    }

    public static void drawBox(){
        String hor = "+------+ +------+";
        String ver = "|      | |      |";
        System.out.println(hor);
        System.out.println(ver);
        System.out.println(ver);
        System.out.println(ver);
        System.out.println(hor);
    }
    public static void drawTri(){
        String top = "   /\\       /\\";
        String mid = "  /  \\     /  \\";
        String bot = " /    \\   /    \\";
        System.out.println(top);
        System.out.println(mid);
        System.out.println(bot);
    }
    public static void drawLabelBox(){
        String verlines = "|      | |      |";
        String topLabel = "|United| |United|";
        String midLabel = "|States| |States|";
        System.out.println(verlines);
        System.out.println(topLabel);
        System.out.println(midLabel);
        System.out.println(verlines);
    }
}

/* Exercise 12: Write a Program called FightSong that produces the output found
 * in this solution. Use at least two static methods to show structure and 
 * eliminate redundancy in your solution. 
 *
 * Author : Wali Morris
 * File   : FightSong.java
 * Date   : 01/08/2020
 */

public class FightSong {
    public static void main(String[] args) {
        for(int i=0;i<2;i++) {
            singVerseOne();
            System.out.println();
            singVerseTwo();
            System.out.println();
        }
    }

    public static void singVerseOne() {
        System.out.println("Go, team, go!\nYou can do it.");
    }

    public static void singVerseTwo() {
        System.out.println("Go, team, go!\nYou can do it.\nYou're the best,\nIn the west.");
        System.out.println("Go, team, go!\nYou can do it.");
    }
}

/* Exercise 13: Write a Java program called StarFigures that generates the 
 * following output of stars , as found in this solution. Use static methods
 * to show structure and eliminate redundancy in your solution. 
 *
 * Author : Wali Morris 
 * File   : StarFigures.java
 * Date   : 01/08/2020
 */

public class StarFigures {
    public static void main(String[] args) {
        twoRowsOfFive();
        twoOneTwo();
        System.out.println();
        twoRowsOfFive();
        twoOneTwo();
        twoRowsOfFive();
        System.out.println();

        for(int i=0;i<3;i++) {
            oneStar();
        }

        twoRowsOfFive();
        twoOneTwo();
    }

    public static void twoRowsOfFive() {
        System.out.println("*****");
        System.out.println("*****");
    }

    public static void twoOneTwo() {
        System.out.println(" * * ");
        System.out.println("  *  ");
        System.out.println(" * * ");
    }

    public static void oneStar() {
        System.out.println("  *  ");
    }
}

/* Exercise 14: Write a Java program called Lanterns that generates the output
 * seen in this solution. use static methods to show structure and eliminate
 * redundancy in your solution.
 *
 * Author : Wali Morris 
 * File   : Lanterns.java
 * Date   : 01/08/2020
 */

public class Lanterns {
    public static void main(String[] args) {
        drawTopLantern();
        drawMidLantern();
        drawBottomLantern();
    }

    public static void drawFiveStars() {
        System.out.println("    *****    ");
    }

    public static void drawNineStars() {
        System.out.println("   *******   ");
    }
    public static void drawThirteenStars() {
        System.out.println("*************");
    }

    public static void drawTwoStarsFiveLines() {
        System.out.println("* | | | | | *");
    }

    public static void drawTopLantern() {
        drawFiveStars();
        drawNineStars();
        drawThirteenStars();
        System.out.println();
    }

    public static void drawMidLantern() {
        drawTopLantern();
        drawTwoStarsFiveLines();
        drawThirteenStars();
        drawTopLantern();
        System.out.println();
    }

    public static void drawBottomLantern() {
        drawTopLantern();
        drawFiveStars();
        drawTwoStarsFiveLines();
        drawTwoStarsFiveLines();
        drawFiveStars();
        drawFiveStars();
    }
}
