package Bank;


public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean Deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        } else {
            System.out.println("Wrong Amount!");
            return false;
        }
    }

    public boolean Withdraw(double amount) {
        if (this.balance > amount) {
            this.balance -= amount;
            return true;
        } else {
            System.out.println("Balance Is Not Enough!");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Account [Balance : " +balance + "]";
    }
}


