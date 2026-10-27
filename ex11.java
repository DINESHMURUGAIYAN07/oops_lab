import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String name;
    double balance;

    BankAccount(int accNo, String n, double bal) {
        accountNumber = accNo;
        name = n;
        balance = bal;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully!");
        } else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: Rs." + balance);
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: Rs." + balance);
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account =
            new BankAccount(1001, "Dinesh", 5000);

        int choice;
        double amount;

        do {
            System.out.println("\n--- BANK MANAGEMENT SYSTEM ---");
            System.out.println("1. Display Account Details");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    account.displayDetails();
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    amount = sc.nextDouble();
                    account.deposit(amount);
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    amount = sc.nextDouble();
                    account.withdraw(amount);
                    break;

                case 4:
                    account.checkBalance();
                    break;

                case 5:
                    System.out.println("Thank you for using our bank!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}s