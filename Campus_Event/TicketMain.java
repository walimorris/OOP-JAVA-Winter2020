import java.util.*; 

public class TicketMain { 
    public static void main(String[] args) { 
	WalkupTicket wt = new WalkupTicket();
        AdvanceTicket at1 = new AdvanceTicket(12);
        AdvanceTicket at2 = new AdvanceTicket(6);
        StudentAdvanceTicket st1 = new StudentAdvanceTicket(10); 
        StudentAdvanceTicket st2 = new StudentAdvanceTicket(4);	
        System.out.println("Walkup Ticket: " + wt);
        System.out.println("Advance Ticket brought 12 days in advance: " + at1);
        System.out.println("Advance Ticket brought 6 days in advance: " + at2); 
        System.out.println("Student Advance Ticket brought 10 days in advance: " + st1);
        System.out.println("Student Advance Ticket brought 4 days in advance: " + st2);	
    } 
} 
