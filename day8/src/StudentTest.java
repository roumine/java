/**
 * 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩
 * score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
 * 问题一：打印出3年级(state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示：
 * 1) 生成随机数：Math.random()，返回值类型double;
 * 2) 四舍五入取整：Math.round(double d)，返回值类型long。
 * */

public class StudentTest {
    public static void main(String[] args) {
        Student[] stus = new Student[20];

        //录入信息
        for (int i = 0; i < stus.length; i++) {
            stus[i] = new Student();
            stus[i].number = i + 1;
            stus[i].state = (int) (Math.random() * (3 - 1 + 1) + 1);
            stus[i].score = (int) (Math.random() * (100 - 0 + 1));
        }

        //打印出3年级(state值为3）的学生信息
        for (int i = 0; i < stus.length; i++) {
            if (stus[i].state == 3){
                System.out.println("student" + stus[i].number + ": state:" + stus[i].state
                        + ", score:" + stus[i].score);
            }
        }

        System.out.println();

        //冒泡排序按学生成绩排序
        for (int i = 0; i <  stus.length - 1; i++){
            for (int j = 0; j < stus.length - i - 1; j++) {
                if (stus[j].score > stus[j + 1].score){
                    Student temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }



        for (int i = 0; i < stus.length; i++) {
            System.out.println("student" + stus[i].number + ": state:" + stus[i].state
                    + ", score:" + stus[i].score);
        }
    }
}
