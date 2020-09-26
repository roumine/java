//账户类
public class Account {
    private double balance; //余额

    public Account(double init_balance){
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void  deposit(double amt){//存钱
        if (amt > 0){
            balance += amt;
            System.out.println("存款成功，余额为：" + this.getBalance());
        }
    }
    public void withdraw(double amt){//取钱
    if (amt > balance){
        System.out.println("余额不足");
    }
    else
        balance -= amt;
    }
}
