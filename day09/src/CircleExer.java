/**
 * （1）定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个
 * findArea()方法返回圆的面积。
 * （2）定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义
 * 如下：public void printAreas(Circle c, int time)在printAreas方法
 * 中打印输出1到time之间的每个整数半径值，以及对应的面积。例如，times为5，则
 * 输出半径1，2，3，4，5，以及对应的圆面积。
 * （3）在main方法中调用printAreas()方法，调用完毕后输出当前半径值。*/

public class CircleExer {
    public static void main(String[] args) {
        PassObject a = new PassObject();
        a.printAreas(new Circle(),4);
    }
}
