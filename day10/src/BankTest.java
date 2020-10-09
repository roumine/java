public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Li");
        bank.getCustomers(0).setAccount(new Account(0));
        bank.getCustomers(0).getAccount().withdraw(100);
        bank.getCustomers(0).getAccount().deposit(100);
        double balance = bank.getCustomers(0).getAccount().getBalance();

        System.out.println(balance + bank.getCustomers(0).getName());
    }


}
