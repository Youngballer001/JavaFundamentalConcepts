//Encapsulation
/*
Encapsulation involves wrapping data and methods into one class while restricting 
direct access to data using access modifiers.
*/
public class BankAccount {
    private double balance;

    public void deposit(double amount){
        balance += amount;
    } 

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(5000);

        System.out.println("Balance: " +account.getBalance());
    }

    
}
