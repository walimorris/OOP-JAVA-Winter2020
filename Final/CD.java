public class CD extends DVD { 
    private final String artist;  
    private final String label; 

    public CD(String title, String artist, String label, String director, String producer, 
	      String genre, String releaseDate) { 
	
	 super(title, director, producer, genre, releaseDate); 
	 this.artist = artist;   
	 this.label = label; 
    } 

    public String getArtist() { 
	return this.artist; 
    } 

    public String getAlbum() { 
	return this.getTitle();
    } 	

    public String getLabel() { 
	return this.label; 
    } 


    @Override 
    public String toString() { 
	return "CD: " + this.getTitle() + ", " + "Artist: " + this.artist + ", " + 
	       "Label: " + this.label + ", " + "Director: " + this.getDirector() + 
	       ", " + "Producer: " + this.getProducer() + ", " + "Genre: " + 
	       this.getGenre() + ", " + "Release Date: " + this.getReleaseDate() + 
	       ", " + "Item Number: " + this.getItemNumber() + ", " + "Reserved: " + 
	       this.getReservation(); 
    }
}  
