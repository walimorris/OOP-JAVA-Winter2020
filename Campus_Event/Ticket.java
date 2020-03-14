/**
 * Tickets represent a ticket type for a campus event, each ticket has a unique number and
 * price; this class serves as the super class for all ticket types 
 * 
 * @author Wali Morris
 */

import java.util.*;
import java.text.*; 

/**
 * Each ticket will have a number
 */ 
abstract class Ticket { 
    private final int number;   
    
    /**
     * Constructor for Ticket which generates random number for the ticket
     */
    public Ticket() { 
	Random r = new Random(); 
        this.number = r.nextInt(10000);	
    }
    
    /**
    * @return randomly generated ticket number 
    */
    public int getNumber() { 
	return this.number; 
    } 	
    
    /**
     * Abstract method implemented in child classes 
     * @see WalkupTicket.java
     * @see AdvancedTicket.java
     * @see StudentAdvanceTicket.java
     */ 
    abstract String getPrice(); 
    
    /**
     * @return Ticket object's data as a string
     */ 
    public String toString() {
	return "Ticket#: " + this.number + ", " + "Price: " + this.getPrice(); 
    } 
} 
