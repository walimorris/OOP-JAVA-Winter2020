/* The Book class extends a Library item with added fields representing a 
 * books characteristics. 
 */

public class Book extends LibraryItem {
    private String title; 
    private String author;
    private String publisher;  
    private String genre; 

    public Book(String title, String author, String genre, String publisher) { 
	super(); 
	this.title = title; 
        this.author = author;
        this.publisher = publisher; 
	this.genre = genre; 
    } 

    public String getTitle() { 
	return this.title; 
    } 

    public String getAuthor() { 
	return this.author; 
    } 

    public String getGenre() { 
	return this.genre; 
    } 

    public String getPublisher() { 
	return this.publisher; 
    }
    
    public String toString() { 
	return "Book: " + this.title + ", " + "Author: " + this.author + ", " + "Genre: " + 
	       this.genre + ", " + "Item Number: " + this.getItemNumber() + ", " + "Reserved : " + 
               this.getReservation(); 
    } 	
} 
