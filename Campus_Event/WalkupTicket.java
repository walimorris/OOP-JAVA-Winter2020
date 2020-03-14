import java.text.*; 

public class WalkupTicket extends Ticket { 
    public WalkupTicket() { 
	super();
    }

    public String getPrice() { 
	return NumberFormat.getCurrencyInstance().format(50.00); 
    }
}  
