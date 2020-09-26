public class Customer {
    private String name; //姓名
    private Account account; //账号

    public Customer(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public Account getAccount(){
        return account;
    }
    public void setAccount(Account acct){
        this.account = acct;
    }
}
