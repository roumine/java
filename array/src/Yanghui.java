public class Yanghui {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];

        for (var i = 0; i < arr.length; i++){
            for (int j = 0; j <= i; j++){
                if (i == 0 || j == 0 || i == j)
                    arr[i][j] = 1;
                else
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
