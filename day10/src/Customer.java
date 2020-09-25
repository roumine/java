public class Customer {
    private String name;
    private Account account;

    public Customer(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public Account getAccount(){
        return account;
    }
    public void setAccount(Account acct){
        this.account = acct;
    }
}
