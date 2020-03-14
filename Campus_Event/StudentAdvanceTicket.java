import java.text.*; 

public class StudentAdvanceTicket extends AdvanceTicket {
    private int days; 

    public StudentAdvanceTicket(int days) {
	super(days);
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
    
