import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = new  int[]{34,5,22,-98,6,-76,0,-3};

        //冒泡
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] >  arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        //反转
        for (int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));

        //复制
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));

        //线性查找22
        int search = 22;
        boolean isFlag = true;
        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i]){
                System.out.println("yes it's" +"\t"+ i);
                isFlag = false;
            }
        }
        if (isFlag){
            System.out.println("no");
        }
    }
}
