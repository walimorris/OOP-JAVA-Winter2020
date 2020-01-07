/* This program creates a few figures: a tea cup, a hat, a stop sign and a 
 * hexigon using static methods. 
 * Author : Wali Morris
 * File   : Figures.java 
 * Date   : 01/07/2020
 */ 

public class Figures { 
    public static void main(String[] args) { 
        System.out.println("A teacup, a hat, a hexigon and a STOP sign!");
        teaCup(); 
        line(); 
        System.out.println(); 	
	hat(); 
	line(); 
	System.out.println();
        hexigon();
        System.out.println(); 
        stopSign(); 	
    } 
    public static void line() { 
        System.out.println("+--------+"); 
    } 
    public static void teaCup(){ 
        System.out.println("\\        /"); 
	System.out.println(" \\______/");
    } 
    public static void hat() {
        System.out.println("  ______  "); 
        System.out.println(" /      \\"); 
        System.out.println("/        \\"); 
    } 
    public static void hexigon() { 
	hat(); 
        teaCup(); 
    }
    public static void stopSign() { 
	hat(); 
        System.out.println("|  STOP  |"); 
        teaCup(); 
    } 
}     
