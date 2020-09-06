public class Suanfa {
    public static void main(String[] args) {
        int[] array1 = new int[]{2, 3, 5, 7, 12};
        int[] array2 = new int[array1.length];
        int[] array3 = new int[array1.length];
        int max = array1[0];
        int min = array1[0];
        int zong = 0;
        float ping = 0;

        System.out.print("数组1为：");
        for (int i = 0; i < array1.length; i++) {
            //复制并变动
            if (i % 2 == 0) array2[i] = i;
            else array2[i] = array1[i];
            System.out.print(array1[i] + "\t"); //利用循环输出数组1

            //最大最小数
            if (max < array1[i]) max = array1[i];
            if (min > array1[i]) min = array1[i];

            //总和及平均数
            zong = array1[i] + zong;
        }
        ping = (float) (zong) / (float) (array1.length);

        System.out.println();
        System.out.print("数组2为：");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }

        //反转数组
        System.out.println();
        System.out.print("反转数组为：");
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[array1.length - i - 1];
            System.out.print(array3[i] + "\t");
        }

        System.out.println();
        System.out.println("最大数为：" + max);
        System.out.println("最小数为：" + min);
        System.out.println("总数为：" + zong);
        System.out.println("平均数为：" + ping);
    }
}
