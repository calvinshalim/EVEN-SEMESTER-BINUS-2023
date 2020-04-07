package Bank;

public class Customer {
    private String firstname;
    private String lastname;
    private Account account;

    public Customer (String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.account  = new Account(500);
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public Account getAccount() {
        return this.account;
    }

    public void setAccount(Account acct) {
        this.account = acct;
    }

    @Override
    public String toString() {
        return "Customer [Name = " + this.getFirstname() + " "  + this.getLastname()+", Balance = " + getAccount() + "]";
    }
}