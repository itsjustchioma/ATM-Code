import java.util.Date;
import java.util.Scanner;

public class SavingsAccount {
    public int id;
    public double balance;
    public double annualIntRate;
    Date dateEstablished = new Date();
    Scanner scanner = new Scanner(System.in);

    // NO ARGUMENT CONSTRUCTOR
    public SavingsAccount() {

    }

    // CONSTRUCTOR THAT CREATES ACCOUNT WITH SPECIFIED ID AND INITIAL BALANCE
    public SavingsAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    // ACCESSORS AND MUTATORS
    public double getAnnualIntRate() {
        return annualIntRate;
    }

    public void setAnnualIntRate(double annualIntRate) {
        this.annualIntRate = annualIntRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // ACCESSOR METHOD FOR dateEstablished
    public Date getDateEstablished() {
        return dateEstablished;
    }

    //METHOD getWeeklyIntRate
    public double getWeeklyIntRate(){
        double weeklyIntRate = (annualIntRate/100)/52;
        double weeklyInterest = balance * weeklyIntRate;
        System.out.println("Your weekly interest amount is: $"+ Math.round(weeklyInterest));
        return weeklyIntRate;
    }

    // METHOD DEPOSIT
    public void deposit(int depositAmount){
        balance += depositAmount;
        System.out.println("New balance "+balance);
    }
}
