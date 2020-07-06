package W02D01Fasy;

public class BasicIntermediate {

    static void printGap(int colWidth, int strLen){
        for (int i=colWidth; i>strLen; i--){
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        Person[] p = new Person[2];
        p[0] = new Person("John", "Doe", 'm', 44);
        p[1] = new Person("Jane", "Boe", 'f', 42);

        for(Person k : p) {
            System.out.println(k);
        }

        for (Person k : p){
            System.out.print(k.getFullName());
            printGap(12, k.getFullName().length());
            System.out.print(k.getGender() + " ");
            printGap(3, String.valueOf(k.getGender()).length());
            System.out.println(k.age); //age is public
            System.out.print(k.getFirstName() + " ");
            System.out.print(k.getLastName().toUpperCase());
            printGap(12, k.getLastName().length());
            System.out.println();
            System.out.println();
        }
    }
}
