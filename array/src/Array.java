import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入学生人数");
//        int j = scanner.nextInt();

        int[] scores = new int[]{}; //存储学生成绩
        int length = 0;
        int max_number = 0;

        //用循环将学生成绩存到数组里
        for (int i = 0; i<100; i++){
            System.out.println("请输入学生"+ i+1 +"成绩,输入0结束");
            int number = scanner.nextInt();
            if (number == 0) break;
            scores[i] = number;
            length = i+1;

            //得到最高成绩
            if (max_number < number){
                max_number = number;
            }
        }


        //成绩等级
        for (int i = 0;i < length; i++){
            if (scores[i] >= max_number - 10) System.out.println("学生" + i+1 + "成绩："+scores[i] + "等级: A");
            else if (scores[i] >= max_number - 20) System.out.println("学生" + i+1 + "成绩："+scores[i] + "等级: B");
            else if (scores[i] >= max_number - 30) System.out.println("学生" + i+1 + "成绩："+scores[i] + "等级: C");
            else System.out.println("学生" + i+1 + "成绩："+scores[i] + "等级: D");
        }
    }
}
