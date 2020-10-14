public class CustomerList { //customer的管理类
    private  Customer[] customers; //用来保存客户对象的数组
    private  int total;        //记录已保存客户对象的数量

    //构造器
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer]; //指定customers数组的最大空间
        total = 0;
    }
    //增
    public boolean addCustomer(Customer customer){
        if (customer != null && total < customers.length) {
            customers[total] = customer;
            total++;
            return true;
        }
        return false;
    }
    //改
    public boolean replaceCustomer(int index, Customer cust){

        if (cust != null && index <= total){
            customers[index] = cust;
        return true;
        }
        return false;
    }
    //删
    public boolean deleteCustomer(int index){
        if (index < total){
            for (int i = index; i < total; i++) {
                customers[i] = customers[i + 1];
            }
            customers[total] = null;
            total--;
            return true;
        }
        return false;
    }
    //查
    public Customer getCustomer(int index){
        if (index < total){
            return customers[index];
        }
        return null;
    }
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for (int i = 0; i < custs.length; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }
    public int getTotal(){
        return total;
    }
}
