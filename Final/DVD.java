/* The DVD class extends Library Item with the added characteristics of a DVD */ 

public class DVD extends LibraryItem { 	
    private final String title; 
    private final String director; 
    private final String producer;
    private final String genre;  
    private final String releaseDate;
    
    public DVD(String title, String director, String producer, String genre, String releaseDate) { 
	super(); 
	this.title = title; 
	this.director = director; 
	this.producer = producer; 
	this.genre = genre; 
	this.releaseDate = releaseDate;
    } 

    public String getTitle() { 
	return this.title; 
    } 

    public String getDirector() { 
	return this.director; 
    } 

    public String getProducer() { 
	return this.producer; 
    } 

    public String getGenre() { 
	return this.genre; 
    } 

    public String getReleaseDate() { 
        return this.releaseDate; 
    } 

    public String toString() { 
	return "DVD: " + this.title + ", " + "Director: " + this.director + ", " + "Producer: " + 
		this.producer + ", " + "Genre: " + this.genre + ", " + "Release Date: " + 
		this.releaseDate + ", " + "Item Number: " + this.getItemNumber() + ", " + 
	        "Reserved: " + this.getReservation(); 	
    } 
}     
        
    
