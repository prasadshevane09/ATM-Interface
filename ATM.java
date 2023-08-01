import java.util.Scanner;

public class ATM {
    private double balance;
    public ATM(String accountNumber) {
        this.balance = 100000.0; 
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double withdraw_amount) {
        if (withdraw_amount > 0 && withdraw_amount <= balance) {
            balance -= withdraw_amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    public void deposit(double deposit_amount) {
        balance += deposit_amount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your account number: ");
        String accountNumber = scanner.nextLine();

        ATM atm = new ATM(accountNumber);

        while (true) {
            System.out.println("\nWelcome to the ATM!");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your current balance is: " + atm.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdraw_amount = scanner.nextDouble();
                    atm.withdraw(withdraw_amount);
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit");
                    double deposit_amount = scanner.nextDouble();
                    atm.deposit(deposit_amount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

