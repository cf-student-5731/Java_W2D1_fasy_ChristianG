package W02D01Fasy;

public class Person {

    private String firstName;
    private String lastName;
    private char gender;
    public int age; //Set public to access directly

    public Person(String firstName, String lastName, char gender, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public String getFullName(){
        return (this.firstName + " " + lastName);
    }

    public String getFirstName(){
        return (this.firstName);
    }

    public String getLastName(){
        return (this.lastName);
    }

    public char getGender(){
        return this.gender;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
