//构造器练习
public class Girl {
    private String name;
    private int age;

    public Girl(){}
    public Girl(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy) {
        System.out.println("married " + boy.getName());
    }

    //比较当前对象与被比较对象的年龄大小
    public int compare(Girl girl) {
        return this.age - girl.age;
    }
}
