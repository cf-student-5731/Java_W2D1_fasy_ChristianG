package W02D01Fasy;

public class BankAccount {

    private float money;

    public BankAccount(float money){
        this.money = money;
    }

    public float getMoney(){
        return this.money;
    }

    public float addMoney(float amount){
        this.money += amount;
        if(this.money <0){
            System.out.println("Your account is in MINUS!");
        }
        return this.money;
    }

    public float withdrawMoney(float amount){
        this.money -= amount;
        if(this.money <0){
            System.out.println("Your account is in MINUS!");
        }
        return this.money;
    }
}
