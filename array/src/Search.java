public class Search {
    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4,5,6,7};
        int flag = 5;
        boolean isFlag = true;

        //顺序查找
//        for (int i = 0; i < arr.length; i++){
//            if (flag == arr[i]){
//                System.out.println("存在,位置为：" + i);
//                isFlag = false;
//                break;
//            }
//        }
//        if (isFlag){
//            System.out.println("不存在");
//        }

        //二分查找（需要顺序排列）
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int middle = start + (end - start) / 2;
            if (flag == arr[middle]){
                System.out.println("存在,位置为：" + middle);
                isFlag = false;
                break;
            }
            else if (flag > arr[middle]){
                start = middle + 1;
            }
            else {
                end = middle - 1;
            }
        }
        if (isFlag){
            System.out.println("不存在");
        }

    }
}
