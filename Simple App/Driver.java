public class Driver {
    public static void main(String[] args) {
    Account acc1 = new Account(30000);
    Bank bank1 = new Bank("Scam Bank");
    bank1.addCustomer("Gardyan", "Akbar");
    bank1.getCustomer(0).setAccount(acc1);
    System.out.println(bank1.getCustomer(0));
    }
}