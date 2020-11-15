import java.util.Arrays;
import java.util.Scanner;

public class HuiWen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("int:");
        String str = scanner.next();
        char arr[] = new char[str.length()];

        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))){
                arr[num] = str.charAt(i);
                num++;
            }
        }

        char arr2[] = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];
        }

        System.out.println("out:" + Arrays.equals(arr, arr2));

    }
}

