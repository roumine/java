

public class Array2 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2};
        int[] arr2 = new int[3];

        String[][] arr3 = new String[3][2];
        String[][] arr4 = new String[3][];

        float[][] arr5 = new float[][]{{1.1f,2.1f},{1.2f,2.2f}};
        
        for (int i = 0;i < arr5.length; i++){
            for (int j = 0;j < arr5[i].length;j++){
                System.out.print(arr5[i][j]);
            }
        }
    }

}
 