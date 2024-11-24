package OOPS;

public class BankAccount extends Person {
    private long accountId;
    private long balance;
    BankAccount(long accountId, String firstName, String lastName) {
        super(firstName, lastName);
        this.accountId = accountId;
        this.balance = 0;
    }

    void deposit(long amount) {
        if(amount < 0) {
            throw new IllegalArgumentException("Please enter a valid amount.");
        }
        this.balance += amount;
    }

    void withdraw(long amount) {
        if(amount < 0) {
            throw new IllegalArgumentException("Please enter a valid amount.");
        }
        this.balance -= amount;
    }

    void displayAccountSummary() {
        System.out.println("Account Info:- \n Name:-"+ this.firstName + " " + this.lastName +"\n Age:- " + this.age);
        System.out.println("Balance:- "+ this.balance);
    }
}
