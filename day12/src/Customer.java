public class Customer {
    private String name;  //姓名
    private char gender;  //性别
    private int age;      //年龄
    private String phone; //电话号码
    private String email; //电子邮箱

    //构造器
    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, char gender,int age,String phone,String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    //get方法
    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    //set方法
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
