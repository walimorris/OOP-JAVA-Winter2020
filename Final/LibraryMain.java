// Client program to test the Librar Item classes

import java.util.*; 
import java.text.*; 

public class LibraryMain { 
    public static void main(String[] args) { 
	Book book1 = new Book("1984", "George Orwell", "Science Fiction", "Harvill Secker"); 
	System.out.println("Book: " + book1.getTitle()); 
	System.out.println("Book Author: " + book1.getAuthor()); 
	System.out.println("Book Genre: " + book1.getGenre()); 
	System.out.println(book1.getTitle() + " reserved: " + book1.getReservation());
	
	// reserve book1
	System.out.println("Reserving " + book1.getTitle() + "..."); 
	book1.setReservation(); 
	System.out.println(book1.getTitle() + " reserved: " + book1.getReservation());   
   	System.out.println(book1.getTitle() + " Number: " + book1.getItemNumber()); 
	
	// test magazine inhertance of book
	Magazine mag1 = new Magazine("Sports Illustrated", "Chris Ballard", 
			"Meredith Corporation", "Sports", 1, 1); 
	System.out.println(mag1.getTitle() + " Number " + mag1.getItemNumber());
        System.out.println(book1.toString()); 
        System.out.println(mag1.toString()); 

        // create new DVD object
	DVD movie1 = new DVD("Apocalypse Now", "Francis Ford Coppola", "Omni Zoetrope", 
			"Drama", "August 15, 1979"); 
        System.out.println(movie1.toString());

        // create new CD object, inherits from DVD 
	CD cd1 = new CD("WildFlowers", "Tom Petty", "Warner Bros", "Rick Rubin", "Sound City", 
			"Rock and Roll", "November 1, 1994"); 
        System.out.println(cd1.toString()); 

        // setting a book to 5days late and receiving fines accrued
	book1.setDaysLate(5); 
        System.out.println("Days Book 1 is late: " + book1.getDaysLate());
        System.out.println("Fine owed: " + book1.getFinesAccrued());
	
	// checking if movie is checked in or out and getting its status  
	System.out.println("Is " + movie1.getTitle() + " checked in: " + movie1.checkStatus()); 
	System.out.println("Checking out " + movie1.getTitle() + "..."); 
	movie1.checkOut(); 
        System.out.println("Is " + movie1.getTitle() + " checked in: " + movie1.checkStatus()); 
        movie1.setDaysLate(10); 
        System.out.println("Days Movie 1 is late: " + movie1.getDaysLate()); 
        System.out.println("Fine owed: " + movie1.getFinesAccrued()); 	
	System.out.println("Checking " + movie1.getTitle() + " back in..."); 
	movie1.checkIn(); 
	System.out.println("Is " + movie1.getTitle() + " checked in: " + movie1.checkStatus());
    } 
}     
