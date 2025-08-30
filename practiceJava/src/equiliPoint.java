import java.util.Scanner;

public class equiliPoint {
    public static  void equalPoint() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("enter " + n + " elements into arrays");
        for (int i = 0; i < n; i++) {
            System.out.print("enter " + "[" + (i + 1) + "]" + "element");
            arr1[i] = sc.nextInt();
        }
        for (int m = 0; m < arr1.length - 1; m++) {
            int sum = 0;
            int sum1 = 0;
            int i = 0;
            for (int j = 0; j <= m; j++) {
                sum += arr1[j];
                i++;
            }

            for (int j = i + 1; j < arr1.length; j++) {
                sum1 += arr1[j];
            }
            if (sum == sum1) {
                System.out.println(i );
                break;
            }
        }
    }
}
