/** This class represents a United States rocket  
 *  introductory exercise to Java programming 
 *  Author: Wali Morris 
 *  File  : Rocket.java
 *  Date  : 01/06/2020
 */ 


class Rocket{ 
    public static void main(String[] args){
	drawTri(); 
        drawBox();
        drawLabelBox();
	drawBox(); 
	drawTri(); 	
    } 
    public static void drawBox(){
        String hor = "+------+";
        String ver = "|      |"; 
        System.out.println(hor);
        System.out.println(ver);
	System.out.println(ver); 
	System.out.println(ver);  
        System.out.println(hor); 
    } 
    public static void drawTri(){
	String top = "   /\\";
        String mid = "  /  \\";	
	String bot = " /    \\"; 	 	
        System.out.println(top); 
	System.out.println(mid); 
	System.out.println(bot); 
    }
    public static void drawLabelBox(){ 
        String verlines = "|      |";
        String topLabel = "|United|";
        String midLabel = "|States|";  	
	System.out.println(verlines);
        System.out.println(topLabel);
	System.out.println(midLabel); 
	System.out.println(verlines); 
    } 	
} 
    
    	    
        
    	

