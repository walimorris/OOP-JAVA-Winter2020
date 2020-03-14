/**
* Advanced tickets can be purchased in advance to the event. If the ticket was purchased 10 
* days in advance, the price will be 30.00 dollars. If the ticket was purchased less than 
* 10 days in advance, the price is 40.00 dollars. 
*
* @author Wali Morris 
*/

import java.text.*; 

public class AdvanceTicket extends Ticket { 
    private int days; 
    
    /** 
    * @param days : numbers of days tickets were purchased in advance of the event
    */
    public AdvanceTicket(int days) { 
	super(); 
	this.days = days; 
    }
    /**
    * @return the price of ticket dependent on how many days in advance the ticket was purchased.
    */
    public String getPrice() { 
	if (this.days >= 10 ) { 
	     String price = NumberFormat.getCurrencyInstance().format(30.00);
             return price; 
	} 
	return NumberFormat.getCurrencyInstance().format(40.00);
    }
}    
