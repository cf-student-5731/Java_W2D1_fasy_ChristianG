package W02D01Fasy;

public class myLibrary {

    static void fillRow (int offset, int length){
        for (int i=0; i<length-offset; i++)
            System.out.print(" ");
    }

    static void printFrame (int length){
        for (int i=0; i<length; i++)
            System.out.print("-");
    }

    static int getTitleLength(Book[] c){
        int length = 0;
        for(Book k : c){
            if (length < k.getTitle().length()){
                length = k.getTitle().length();
        }
    }
        return length;
}

    static int getAuthorLength(Book[] c){
        int length = 0;
        for(Book k : c){
            if (length < k.getAuthor().length()){
                length = k.getAuthor().length();
            }
        }
        return length;
    }

    static int getIsbnLength(Book[] c){
        int length = 0;
        for(Book k : c){
            if (length < k.getIsbn().length()){
                length = k.getIsbn().length();
            }
        }
        return length;
    }

    static int getAvailabilityLength(Book[] c){
        int length = 0;
        for(Book k : c){
            if (length < k.getAvailability().length()){
                length = k.getAvailability().length();
            }
        }
        return length;
    }

    static int getLibNrLength(Book[] c){
        int length = 0;
        for(Book k : c){
            if (length < String.valueOf(k.getLibNr()).length()){
                length = String.valueOf(k.getLibNr()).length();
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int amountOfBooks = 5;


        Book[] b = new Book[amountOfBooks];

        b[0] = new Book("Java in a Nutshell", "Benjamin J Evans, David Flanagan", "978-1449370824", 1, false);
        b[1] = new Book("Beginning Programming with Java For Dummies", "Barry Burd ", "978-1119235538", 2, true);
        b[2] = new Book("Web Design with HTML, CSS, JavaScript and jQuery Set", "Jon Duckett ", "978-1118907443", 3, true);
        b[3] = new Book("Überleben unter Arschlöchern", "Robert I Sutton", "978-3492057400", 4, true);
        b[4] = new Book("Database Systems: Design, Implementation, & Management", "Carlos Coronel, Steven Morris", "978-1337627900", 5, false);


        int TitleMaxLength = getTitleLength(b);
        int AuthorMaxLength = getAuthorLength(b);
        int AuthorIsbnMaxLength = getIsbnLength(b);
        int LibNrMaxLength = getLibNrLength(b);
        int LibAvailabilityMaxLength = getAvailabilityLength(b);

        System.out.println();
        System.out.print(" | ");
        printFrame(TitleMaxLength);
        System.out.print(" | ");
        printFrame(AuthorMaxLength);
        System.out.print(" | ");
        printFrame(AuthorIsbnMaxLength);
        System.out.print(" | ");
        printFrame(LibNrMaxLength);
        System.out.print(" | ");
        printFrame(LibAvailabilityMaxLength);
        System.out.print(" | ");


        System.out.println();
        System.out.print(" | ");
        System.out.print("TITLE");
        fillRow("TITLE".length(), TitleMaxLength);
        System.out.print(" | ");
        System.out.print("AUTHOR");
        fillRow("AUTHOR".length(), AuthorMaxLength);
        System.out.print(" | ");
        System.out.print("ISBN");
        fillRow("ISBN".length(), AuthorIsbnMaxLength);
        System.out.print(" | ");
        System.out.print("#");
        fillRow("#".length(), LibNrMaxLength);
        System.out.print(" | ");
        System.out.print("Availability");
        fillRow("Availability".length(), LibAvailabilityMaxLength);
        System.out.print(" | ");

        System.out.println();
        System.out.print(" | ");
        printFrame(TitleMaxLength);
        System.out.print(" | ");
        printFrame(AuthorMaxLength);
        System.out.print(" | ");
        printFrame(AuthorIsbnMaxLength);
        System.out.print(" | ");
        printFrame(LibNrMaxLength);
        System.out.print(" | ");
        printFrame(LibAvailabilityMaxLength);
        System.out.print(" | ");


        for(Book j : b) {
            System.out.println();
            System.out.print(" | ");
            System.out.print(j.getTitle());
            fillRow(j.getTitle().length(), TitleMaxLength);
            System.out.print(" | ");
            System.out.print(j.getAuthor());
            fillRow(j.getAuthor().length(), AuthorMaxLength);
            System.out.print(" | ");
            System.out.print(j.getIsbn());
            fillRow(j.getIsbn().length(), AuthorIsbnMaxLength);
            System.out.print(" | ");
            System.out.print(j.getLibNr());
            fillRow(String.valueOf(j.getLibNr()).length(), LibNrMaxLength);
            System.out.print(" | ");
            System.out.print(j.getAvailability());
            fillRow(j.getAvailability().length(), LibAvailabilityMaxLength);
            System.out.print(" | ");
           }
    System.out.println();

    }
}