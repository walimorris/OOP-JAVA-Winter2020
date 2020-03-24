// A class to represent janitors. 
public class Janitor extends Employee { 
    @Override 
    public void showHours() { 
	System.out.println("I work 80 hours per week."); 
    } 

    @Override 
    public void showSalary() { 
	System.out.println("My salary is $30,000."); 
    } 

    @Override
    public void showVacation() { 
	System.out.println("I receive 5 days vacation."); 
    } 

    public void clean() { 
	System.out.println("Workin' for the man."); 
    } 
} 
