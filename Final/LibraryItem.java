/**
 * The LibraryItem class acts as the superclass for the common information 
 * in a library item. Other items include books, magazines, DVDs and CDs. 
 *
 * @author Wali Morris 
 */ 

import java.util.*;
import java.text.*; 

/**
 * Each general library item will have: 
 * a number routing to this item 
 * boolean representing if the item is reserved or not
 */
abstract class LibraryItem { 
    private final int number; 
    private boolean reserved;
    private boolean checkedIn;
    private int daysLate; 
    private double finesAccrued;   
    
    /**
     * A constructor to generate a number routing to every library item 
     * every created item starts as unreserved 
     */
    public LibraryItem() { 
	Random r = new Random(); 
        this.number = r.nextInt(100000); 
	this.reserved = false;
	this.checkedIn = true; 
	this.daysLate = 0; 
	this.finesAccrued = 0.0; 
    } 
    
    /**
     * @return item's number
     */
    public int getItemNumber() { 
	return this.number; 
    } 

    public void setReservation() {
	this.reserved = true; 
    } 

    public void releaseReservation() { 
	this.reserved = false; 
    } 

    public boolean getReservation() { 
	return this.reserved; 
    }

    public void checkIn() { 
	this.checkedIn = true; 
    } 

    public void checkOut() { 
	this.checkedIn = false; 
    } 

    public boolean checkStatus() { 
	return this.checkedIn; 
    } 

    public void setDaysLate(int days) { 
	this.daysLate += days;
        this.finesAccrued += days * .5; 	
    } 

    public int getDaysLate() { 
	return this.daysLate; 
    } 

    public String getFinesAccrued() { 
	return NumberFormat.getCurrencyInstance().format(this.finesAccrued);  
    } 
}  
	
	 
	





    
