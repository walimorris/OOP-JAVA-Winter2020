import java.text.*; 

public class AdvanceTicket extends Ticket { 
    private int days; 

    public AdvanceTicket(int days) { 
	super(); 
	this.days = days; 
    }

    public String getPrice() { 
	if (this.days >= 10 ) { 
	     String price = NumberFormat.getCurrencyInstance().format(30.00);
             return price; 
	} 
	return NumberFormat.getCurrencyInstance().format(40.00);
    }
}    
