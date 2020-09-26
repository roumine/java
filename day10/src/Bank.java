import java.util.Scanner;

public class Bank {
    Scanner scanner = new Scanner(System.in);
    private Customer[] customers = new Customer[10];//存放多个客户数据
    private int numberOfCustomers = 0;//记录客户个数

    public Bank(){

    }

    public void addCustomer(String name){
        Customer customer = new Customer(name);
//        customers[numberOfCustomers] = customer;
//        numberOfCustomers = getNumberOfCustomers();

        customers[numberOfCustomers++] = customer;//执行完成后+1
    }
    public int getNumberOfCustomers(){
//        return numberOfCustomers += 1;
        return numberOfCustomers;
    }

    public Customer getCustomers(int index) {
        if (index >= 0 && index < numberOfCustomers)
            return customers[index];
        return null;
    }
}
