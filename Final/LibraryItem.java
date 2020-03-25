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
 * boolean representing if item is checked in or out
 * integer representing number of days this item is late to check in
 * a double representing the fines accrued (.50 cents every day late)
 */
abstract class LibraryItem { 
    private final int number; 
    private boolean reserved;
    private boolean checkedIn;
    private int daysLate; 
    private double finesAccrued;   
  
    public LibraryItem() { 
	Random r = new Random(); 
        this.number = r.nextInt(100000); // creates an item number once created  
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
    
    /**
     * reserves an item in the system
     */
    public void setReservation() {
	this.reserved = true; 
    } 
    
    /**
     * releases an item from being reserved
     */
    public void releaseReservation() { 
	this.reserved = false; 
    } 
    
    /**
     * @return whether an item is reserved or not
     */
    public boolean getReservation() { 
	return this.reserved; 
    }
    
    /**
     * checks an item back into the system
     */
    public void checkIn() { 
	this.checkedIn = true; 
    } 
    
    /**
     * checks an item out of the system
     */
    public void checkOut() { 
	this.checkedIn = false; 
    } 
    
    /**
     * @return true: if an item is checked in, false: if item is checked out
     */
    public boolean checkStatus() { 
	return this.checkedIn; 
    } 
     
    /**
     * @param number of days an item is late 
     * multipllies a late fee of .50 by the number of days late 
     * sets finesAccrued to the late fee
     */
    public void setDaysLate(int days) { 
	this.daysLate += days;
        this.finesAccrued += days * .5; 	
    } 

    /**
     * @return number of days item is late
     */
    public int getDaysLate() { 
	return this.daysLate; 
    } 
    
    /** 
     * @return fines owed in currency format
     */ 
    public String getFinesAccrued() { 
	return NumberFormat.getCurrencyInstance().format(this.finesAccrued);  
    } 
}  
