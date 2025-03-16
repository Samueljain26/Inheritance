// Main class
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(101, 5000, 4.5);
        CheckingAccount checking = new CheckingAccount(102, 3000, 10000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount(103, 20000);

        // Display account types
        savings.displayAccountType();
        checking.displayAccountType();
        fixedDeposit.displayAccountType();
    }
}

// Superclass
class BankAccount {
    int accountNumber;
    double balance;

    // Constructor
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    double interestRate;

    // Constructor
    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

// Subclass
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    // Constructor
    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Checking Account");
    }
}

// Subclass
class FixedDepositAccount extends BankAccount {
    // Constructor
    FixedDepositAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}
/*Savings Account
Checking Account
Fixed Deposit Account
 */