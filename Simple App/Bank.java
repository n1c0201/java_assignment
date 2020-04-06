import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private int numberOfCustomers = 0;
    private String bankName;

    public Bank(String bName) {
        this.bankName = bName;
    }

    public void addCustomer(String f, String l){
        Customer customer = new Customer(f, l);
        customers.add(customer);
        numberOfCustomers++;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index){
        return customers.get(index);
    }

    

}