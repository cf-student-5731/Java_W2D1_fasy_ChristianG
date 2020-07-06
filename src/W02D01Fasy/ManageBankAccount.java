package W02D01Fasy;

public class ManageBankAccount {

    public static void main(String[] args) {
        BankAccount b = new BankAccount(5000f);

        b.addMoney(200f);
        System.out.println(b.getMoney());

        b.withdrawMoney(6000f);
        System.out.println(b.getMoney());

    }

}
