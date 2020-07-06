package chris;

public class Book {
    String author, title, publisher;
    int year, edition;
    boolean available;
    public Book (String author, String title, String publisher, int edition, int year, boolean available) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.edition = edition;
        this.year = year;
        this.available = available;
    }
    public void listBook() {
        System.out.println("\n" + title + "\nby " + author + "\n" + publisher + ", " + edition + ". Edition, " + year);
    }
    public boolean isAvailable() {
        return available;
    }
}
