import java.util.Scanner;

public class SavingsAccountRunner {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.setBalance(0);
        savingsAccount.setId(0);
        savingsAccount.setAnnualIntRate(0.00);

        System.out.println("Welcome to your Savings Account App!");
        System.out.println("Enter your account number ID: ");
        int no = scanner.nextInt();
        savingsAccount.setId(no);
        System.out.println("Enter your initial balance: ");
        double ba = scanner.nextDouble();
        savingsAccount.setBalance(ba);
        System.out.println("Enter your annual interest rate: ");
        double ai = scanner.nextDouble();
        savingsAccount.setAnnualIntRate(ai);

        while(true){
        System.out.println("====================");
        System.out.println("=  OPTIONS BELOW   =");
        System.out.println("====================");
        System.out.println("1. Deposit");
        System.out.println("2. View Weekly Interest Rate ");
        System.out.println("3. View Account Details");
        System.out.println("4. Exit");
        int options = scanner.nextInt();

        switch(options){
            case 1:
                System.out.println("Enter your deposit amount: ");
                int depositAmount = scanner.nextInt();
                if (depositAmount >=0){
                    savingsAccount.deposit(depositAmount);
                }
                else{
                    System.out.println("Invalid input");
                }
                break;
            case 2:
                savingsAccount.getWeeklyIntRate();
                break;
            case 3:
                System.out.println("Account ID: "+ no);
                System.out.println("Account Creation Date/Time: "+ savingsAccount.getDateEstablished());
                System.out.println("Balance: "+ savingsAccount.getBalance());
                System.out.println("Weekly interest amount: "+savingsAccount.getWeeklyIntRate());
                break;
            case 4:
                System.out.println("Thank you-Goodbye!");
                System.exit(0);
        }
        }
    }
}
