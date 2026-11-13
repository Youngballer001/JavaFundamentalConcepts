//A Complete OOP Practical example.
/*
This example combines classes, objects, constructors, encapsulation, inheritance,
ovverriding and polymorphism.
*/

class Account{
    private String accountHolder;
    protected double balance;

    Account(String accountHolder, double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    void deposit(double amount){
        balance +=amount;
        System.out.println("Deposit successful.");
    }

    void withdraw(double amount){

        if(amount <= balance){
            balance -=amount;
            System.out.println("Withdrawal successful");
        }else{
            System.out.println("Insufficient balancee.");
        }
    }

    void displayBalance(){
        System.out.println("Balance: "+balance);
    }
}

class SavingsAccount extends Account{

    SavingsAccount(String name, double balance){
        super(name, balance);
    }

    @Override
    void displayBalance(){
        System.out.println("Savings Account");
        System.out.println("Holder: "+getAccountHolder());
        System.out.println("Balance: "+balance);
    }

}

public class MainExample{
    public static void main(String[] args){

        SavingsAccount account = new SavingsAccount("Denis", 10000);

        account.displayBalance();

        account.deposit(5000);

        account.withdraw(2000);

        account.displayBalance();

    }
}