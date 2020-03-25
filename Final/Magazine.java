/* The magazine class inherits from the Book class with the added characteristics
 * of a magazine, including the Magazine volume and issue number
 */

public class Magazine extends Book {
    private int volume; 
    private int issue; 

    public Magazine(String title, String author, String genre, String publisher, 
		    int volume, int issue) {  
        
	super(title, author, publisher, genre);
        this.volume = volume; 
        this.issue = issue; 	
    }

    public int getVolume() { 
	return this.volume; 
    } 

    public int getIssue() { 
	return this.issue; 
    } 
    
    @Override
    public String toString() { 
	return "Magazine: " + this.getTitle() + ", " + "Author: " + this.getAuthor() + ", " + 
	       "Genre: " + this.getGenre() + ", " + "Publisher: " + this.getPublisher() + ", " + 
	       "Volume: " + this.volume + ", " + "Issue: " + this.issue + ", " + "Item Number: " + 
	       this.getItemNumber() + ", " + "Reserved : " + this.getReservation();
    }
}     
    
