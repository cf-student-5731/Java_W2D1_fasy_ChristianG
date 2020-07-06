package W02D01Fasy;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private int libNr;
    private boolean availability;

    public Book(String title, String author, String isbn, int libNr, boolean availability){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.libNr = libNr;
        this.availability = availability;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public int getLibNr(){
        return this.libNr;
    }

    public String getAvailability(){
        if(this.availability){
            return "Available";
        }
        else{
            return "NOT Available";
        }
    }
}
