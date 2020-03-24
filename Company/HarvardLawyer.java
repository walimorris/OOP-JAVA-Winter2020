// A class to represent a Harvard lawyer. 
public class HarvardLawyer extends Lawyer { 
    @Override 
    public void applyForVacation() { 
	int count = 4; 
	while ( count > 0 ) { 
	    System.out.println("Fill out pink form."); 
	    count--; 
	} 
    } 
         	
    @Override 
    public void showVacation() { 
	System.out.println("I receive 3 weeks and 3 days vacation."); 
    } 

    @Override
    public void showSalary() { 
	System.out.println("My salary is $48,000."); 
    }
}
	
