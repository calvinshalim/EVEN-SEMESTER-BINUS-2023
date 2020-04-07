package Bank;

public class Driver {
    public static void main(String[] args) {
        Account A1 = new Account(5000);
        Account A2 = new Account(10000);
        Customer C1 = new Customer("Calvin","Halim");
        Customer C2 = new Customer("Olivia","Virginia");
        Bank B1 = new Bank("BNI");
        B1.addCustomer(C1); //add customers to the bank customer lists
        B1.addCustomer(C2);

        System.out.println("\nNumber of Customers in BANK BNI : "+ B1.getNumberOfCustomers()); //output = 2
        C1.setAccount(A1); //set A1 to C1
        C2.setAccount(A2); // set A2 to C2
       System.out.println(B1.getcustomer());
        System.out.println(C1.toString());
        System.out.println(C2.toString());
        A1.Deposit(3000); // deposit 3000 to calvin's acc so balance should be '8000'
        A2.Withdraw(4000); //withdraw 4000 so balance should be '6000'
        System.out.println("\n" + C1.toString());
        System.out.println(C2.toString() + "\n");

        //test if deposit is a negative num and withdraw more money than balance
        A1.Deposit(-1000); //output : Wrong Amount!
        A2.Withdraw(1000000); //output : Balance is not enough!





    }
}
