package chris;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Person {
    String firstName, lastName;
    int age;
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public void getFullName() {
        System.out.println(firstName + " " + lastName.toUpperCase());
    }
    public static void assignment (int assignment) {
        System.out.println("\n\n\n##########");
        System.out.println("### A" + assignment + " ###");
        System.out.println("##########\n");
    }

    public static void main(String[] args) {
        assignment(1);
        assignment(2);
        Person p1 = new Person("Masha", "Gessen", 50);
        p1.getFullName();
        assignment(3);
        BankAccount b1 = new BankAccount(p1, 100);
        b1.deposit(100);
        b1.withdraw(150);
        b1.withdraw(200);
        assignment(4);
        Time[] timeArray = new Time[4];
        timeArray[0] = new Time(17, 30, 10);
        timeArray[1] = new Time(233, 341, 23);
        timeArray[2] = new Time(96, 34, 421);
        timeArray[3] = new Time(1, 67, 66);
        for (Time time : timeArray) {
            time.printTime();
        }
        System.out.println("\nBefore");
        timeArray[0].printTime();
        //timeArray[0].addSeconds(30);
        timeArray[0].addTime(1,20,50);
        System.out.println("after");
        timeArray[0].printTime();
        Date d1 = new Date(20, 122, 2017);
        d1.printDate();
        assignment(5);
        Book[] library = new Book[5];
        library[0] = new Book("H. Mössenböck", "Sprechen Sie Java? Eine Einführung in das systematische Programmieren", "dpunkt.verlag", 5, 2014, true);
        library[1] = new Book("R. Schiedermeier", "Programmieren mit Java", "Pearson Studium", 2, 2010, true);
        library[2] = new Book("R. C. Martin", "Clean Code - Refactoring, Patterns, Testen und Techniken für sauberen Code", "mitp", 1, 2009, true);
        library[3] = new Book("R. Sedgewick, K. Wayne", "Computer Science: An Interdisciplinary Approach", "Addison Wesley", 1, 2016, false);
        library[4] = new Book("R. Sedgewick, K. Wayne", "Algorithms", "Addison Wesley", 4, 2011, true);
        for (Book book : library) {
            book.listBook();
        }
        System.out.println("\n---\nListing available Books");
        for (Book book : library) {
            if (book.isAvailable()) {
                book.listBook();
            }
        }
        assignment(6);
    }
}
