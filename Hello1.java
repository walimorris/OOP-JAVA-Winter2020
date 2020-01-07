/* A for loop example drawing multiple boxes to the screen
 * Author : Wali Morris
 * File   : Hello1.java
 * Date   : 01/06/2020
 */

class Hello1 {
    public static void main(String[] args) { 
        System.out.println("Hello World");
    
        for(int i=0; i<5; i++) {
            drawBox(); 
	}
    }
    public static void drawBox() {
    String top = "+---+"; 
    String mid = "|   |";
    String bot = "+---+";  
    System.out.println(top); 
    System.out.println(mid);
    System.out.println(bot);   
	} 
} 
 

	
