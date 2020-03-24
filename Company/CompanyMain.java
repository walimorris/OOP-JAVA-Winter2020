// A client program to test the two newest classes: Janitor and Harvard lawyer

public class CompanyMain { 
    public static void main(String[] args) { 
	Janitor j = new Janitor(); 
	HarvardLawyer ivy = new HarvardLawyer(); 
	j.showHours(); 
	j.showSalary(); 
	j.showVacation(); 
	j.clean();
	ivy.applyForVacation();
        ivy.showSalary(); 
        ivy.sue(); 	
    } 
} 
        	
