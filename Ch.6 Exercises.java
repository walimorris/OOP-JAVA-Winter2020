// Chapter 6 introduces file/data manipulation. 

/* Introduction: This short program is an intro to file manipulations using
 * Java.
 *
 * Author : Wali Morris 
 * File   : TestFile.java
 * Date   : 01/26/2020
 */

import java.util.*;
import java.io.*;

public class TestFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("testfile.txt"));
        int count = 0;
        while(input.hasNext()) {
            String word = input.next();
            System.out.println(word);
            count++;
        }
        System.out.printf("This file contains: %d words\n", count);
    }
}

 * File   : BoysGirlsName.java 
 * Date   : 01/27/2020
 */

import java.util.*;
import java.io.*;

public class BoysGirlsName {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("BoysGirlsName.txt"));

        while(input.hasNextLine()) {
            String text = input.nextLine();
            processLine(text);
        }
    }
    /* This function is passed one parameter, a line of text. 
     * The first piece of text read is a name, followed by an 
     * integer. It's decided if the name is a boy name or girl 
     * name. We know boys are first, so the first name and its 
     * integer goes to the sum of boys. Every other name must be 
     * a girls name and so its integer goes to the sum of girls.
     * The absolute difference of the boy and girl integers is 
     * printed to the console. 
     */
    public static void processLine(String text) {
        Scanner data = new Scanner(text);

        int boysSum = 0;
        int girlsSum = 0;
        int sum = 0;
        while(data.hasNext()) {
            String name = data.next();
            System.out.print(name + "(boy): ");
            int boys = data.nextInt();
            System.out.println(boys);
            boysSum += boys;
            /* Atleast one name exists, but names may be odd so in this case we
             * must scan ahead to ensure a name exists' and it's the eof. If 
             * it's the end of file, we must stop reading.
             */
            if(data.hasNext()) {
                name = data.next();
                System.out.print(name + "(girl): ");
                int girls = data.nextInt();
                System.out.println(girls);
                girlsSum += girls;
            }
        }
        System.out.println("Boys sum: " + boysSum);
        System.out.println("Girls sum: " + girlsSum);
        System.out.println("Absolute difference: " + Math.abs(boysSum - girlsSum));
    }
}
