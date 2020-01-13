/* Write a Java program that uses a String variable to store a sentence and 
 * then changes it to uppercase and displays it on the screen.
 *
 * Author : Wali Morris 
 * File   : StringVariable.java
 * Date   : 01/13/2020
 */

public class StringVariable {
    public static void main(String[] args) {
        String var = "Welcome to the new world!";
        System.out.println(var.toUpperCase());
    }
}

/* From the command line this program allows you to print an arguement
 * after Hello World is printed by using args in main. For instance, 
 * after this program is compiled you can run java HelloWorldCL Wali
 * and "Hello World Wali" will be printed in he console. I thought 
 * this was pretty cool because I was always confused with what the
 * reason for args has been. 
 *
 * Author : Wali Morris 
 * File   : HelloWorldCL.java
 * Date   : 01/13/2020
 */

public class HelloWorldCL {
    public static void main(String[] args) {
        System.out.println("Hello World " + args[0]);
    }
}
