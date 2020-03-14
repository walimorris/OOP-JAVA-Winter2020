/**
* Walkup Tickets are categorized as tickets purchased at the event. 
* 
* @author Wali Morris 
*/ 

import java.text.*; 

public class WalkupTicket extends Ticket { 
    public WalkupTicket() { 
	super();
    }
    
    /**
    * Walkup Tickets are set to a fixed price of 50 dollars. 
    * @return price of walkup ticket
    */
    public String getPrice() { 
	return NumberFormat.getCurrencyInstance().format(50.00); 
    }
}  
