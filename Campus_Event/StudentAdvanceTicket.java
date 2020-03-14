/**
* Student Advance Tickets are the best priced when purchased in advance. For tickets
* purchased 10 days or more in advance, the price is 15.00 dollars. Tickets purchased 
* than 10 days in advance are 20.00 dollars. 
* 
* @author Wali Morris 
*/

import java.text.*; 

public class StudentAdvanceTicket extends AdvanceTicket {
    private int days; 

    public StudentAdvanceTicket(int days) {
	super(days); // mainly called to generate random ticket number 
        this.days = days; 	
    } 
    
    @Override 
    public String getPrice() { 
	if (this.days >= 10 ) { 
	    return NumberFormat.getCurrencyInstance().format(15); 
	} 
	return NumberFormat.getCurrencyInstance().format(20);
    }
    
    @Override
    public String toString() { 
	return "Ticket#: " + this.getNumber() + ", " + "Price: " + this.getPrice() + 
		" (ID Required)";
    } 
}    
