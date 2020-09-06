import java.util.Arrays;
import java.util.Scanner;

public class ScoreHierarchy {
    // 迪米特法则： 只与直接朋友通信
    // 属性、方法形参、返回类型是直接朋友。
    // 方法内局部变量的类型不能是陌生类
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("请输入学生人数：");
        int length = in.nextInt();
        int[] scores = new int[length];
//        int max = 0;

        // 从末尾访问数组，依次输入成绩，并存储到相应位置
        for (length -= 1; length >= 0; length--) {
            System.out.print("请输入成绩：");
            scores[length] = in.nextInt();
            // 将本次输入的成绩和最大值比较，若大于则更换最大值
//            if (scores[length] > max) max = scores[length];
        }
        Arrays.sort(scores);

        // 遍历成绩数组，分级输出
        for (int i = scores.length - 1; i >= 0; i--) {
            if (scores[i] >= scores[scores.length - 1] - 10) System.out.println(scores[i] + ": A");
            else if (scores[i] >= scores[scores.length - 1] - 20) System.out.println(scores[i] + ": B");
            else if (scores[i] >= scores[scores.length - 1] - 30) System.out.println(scores[i] + ": C");
            else System.out.println(scores[i] + ": D");
        }
    }
}
