import java.util.Scanner;

public class View {
    CustomerList customerList = new CustomerList(10);
    private static Scanner scanner = new Scanner(System.in);

    public void enterMainMenu() {
        boolean flag = true;

        do {
            System.out.println("\n-----------------客户信息管理软件-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出\n");
            System.out.print("                   请选择(1-5)：");


            char chosen = CMUtility.readMenuSelection();
            switch (chosen) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("确认退出？");
                    char choice = CMUtility.readConfirmSelection();
                    if (choice == 'Y') {
                        flag = false;
                    } else break;
            }
        } while (flag);
    }

    private void addNewCustomer() {
        System.out.println("-----------------添加客户-----------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(10);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(11);
        System.out.print("邮箱：");
        String email = CMUtility.readString(20);

        Customer customer = new Customer(name, gender, age, phone, email);
        boolean isFlag = customerList.addCustomer(customer);
        if (isFlag) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    private void modifyCustomer() {
        System.out.println("-----------------修改客户-----------------");
        System.out.print("请输入修改编号（负数退出）");
        int num = CMUtility.readInt();
        if (num < 0) {
            this.enterMainMenu();
        } else if (num > 0 && num < customerList.getTotal()) {
            Customer customer = customerList.getCustomer(num - 1);

            System.out.print("姓名(" + customer.getName() + "):");
            // 如果用户输入了姓名，则返回用户输入的信息，如果用户没有输入，直接回车，则返回customer.getName()
            String name = CMUtility.readString(5, customer.getName());

            System.out.print("性别(" + customer.getGender() + "):");
            char gender = CMUtility.readChar(customer.getGender());

            System.out.print("年龄(" + customer.getAge() + "):");
            int age = CMUtility.readInt(customer.getAge());

            System.out.print("电话(" + customer.getPhone() + "):");
            String phone = CMUtility.readString(13, customer.getPhone());

            System.out.print("邮箱(" + customer.getEmail() + "):");
            String email = CMUtility.readString(15, customer.getEmail());

            customer = new Customer(name, gender, age, phone, email);
            boolean isFlag = customerList.replaceCustomer(num - 1, customer);
            if (isFlag) {
                System.out.println("修改成功");
            } else {
                System.out.println("修改失败");
            }
        } else System.out.println("无法找到该用户");
    }

    private void deleteCustomer() {
        System.out.println("-----------------删除客户-----------------");
        System.out.print("请输入删除编号（负数退出）");
        int num = CMUtility.readInt();
        if (num < 0) {
            this.enterMainMenu();
        }

        else if (num > 0 && num < customerList.getTotal()) {
            System.out.print("确认删除？");
            char del = CMUtility.readConfirmSelection();
            if (del == 'Y'){
                boolean isFlag = customerList.deleteCustomer(num - 1);
                if (isFlag) {
                    System.out.println("删除成功");
                } else {
                    System.out.println("删除失败");
            }
            }else if (del == 'N')return;
        }else System.out.println("未找到指定用户");
    }

    private void listAllCustomers() {
        System.out.println("-----------------客户列表-----------------");
        Customer[] customers = customerList.getAllCustomers();
        if (customers.length == 0) {
            System.out.println("暂时没有客户");
        } else {
            System.out.println("姓名\t性别\t年龄\t电话号码\t电子邮箱");
            System.out.println(customerList.getTotal());
            for (int i = 0; i < customers.length; i++) {
                System.out.println(customers[i].getName() +"\t"+
                        customers[i].getGender() +"\t"+
                        customers[i].getAge() +"\t"+
                        customers[i].getPhone() +"\t"+
                        customers[i].getEmail());
            }
        }
    }

    public static void main(String[] args) {
        View view = new View();
        view.enterMainMenu();
    }
}
