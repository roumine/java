import java.util.Arrays;

/**
 1.定义含有属性age(int), name(String)的类Person
 2.编写函数int compare(Person p1, Person p2)实现类Person的多级排序(若age相同则比较name)

 代码模版(放入main函数)

 var persons = new Person[6];
 persons[0] = new Person(1, "d");
 persons[1] = new Person(1, "c");
 persons[2] = new Person(2, "a");
 persons[3] = new Person(1, "d");
 persons[4] = new Person(3, "e");
 persons[5] = new Person(3, "b");

 Arrays.sort(persons, (p1, p2) -> compare(p1, p2));
 System.out.println(Arrays.toString(persons));*/

public class Person {
    int age;
    String name;



    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static int compare(Person p1, Person p2){
        var ageDiff = p1.age - p2.age;
        if (ageDiff != 0) return ageDiff;

        return p1.name.compareTo(p2.name);
    }

    public static void main(String[] args) {
        var persons = new Person[6];
        persons[0] = new Person(1, "d");
        persons[1] = new Person(1, "c");
        persons[2] = new Person(2, "a");
        persons[3] = new Person(1, "d");
        persons[4] = new Person(3, "e");
        persons[5] = new Person(3, "b");

        Arrays.sort(persons, (p1, p2) -> compare(p1, p2));
        System.out.println(Arrays.toString(persons));
    }

}
