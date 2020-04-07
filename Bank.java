package Bank;
import java.util.ArrayList;


public class Bank {
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private int numberOfCustomers = 0;
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void addCustomer(String firstname, String lastname) { //initiate this if you havent create a cust or theres no cust.
        this.customers.add(new Customer(firstname, lastname));
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public ArrayList getcustomer() {
        return customers;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers = customers.size();
        }

     public Customer getCustomer(int index) {
        return this.customers.get(index);
    }
}


