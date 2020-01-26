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
