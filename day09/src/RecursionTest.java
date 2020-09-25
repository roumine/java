//递归方法：计算1-100之间所有自然数之和
public class RecursionTest {
    public static void main(String[] args) {
        //输出1-100之间所有自然数之和。阶乘类似
        RecursionTest a = new RecursionTest();
        int sum = a.sum(100);
        System.out.println(sum);

        //已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0
        //的整数，求f(10)的值。
        System.out.println(a.f(10));

        //输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
        //1 1 2 3 5 8 13 21 34 55
        //规律：一个数等于前两个数之和
        //要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来
    }

    public int sum(int i){
        if (i == 1) return i;
        return i + sum(i - 1);
    }

    public int f(int i){
        if (i == 0) return 1;
        if (i == 1) return 4;
        return 2*f(i - 1) + f(i - 2);
    }

    public int fei(int i){
        if (i == 0) return 1;
        if (i == 1) return 4;
        return 2*f(i - 1) + f(i - 2);
    }

}
