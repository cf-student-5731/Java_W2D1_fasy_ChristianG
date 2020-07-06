package chris;

/**
 * Which has an account balance and methods to add and withdraw money, as well as to print the account balance.
 *
 * 1. Create the class and its constructor.
 *
 * 2. Create a constructor that sets an initial amount of money to the account.
 *
 * 3. Demonstrate the process of adding and withdrawing money and print the results.
 *
 * 4. Improve your system by adding a notice printed into the console when an account has
 *
 * gone into minus after some transaction.
 */


public class BankAccount {
    double balance;
    Person owner;
    public BankAccount(Person owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        printDebit();
    }
    public void withdraw(double amount) {
        balance -= amount;
        printDebit();
    }
    private void printDebit() {
        if (balance < 0) {
            System.out.println("You are with " + -balance + " in debt.");
        }
    }
}
