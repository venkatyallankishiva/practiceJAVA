import java.util.Scanner;

public class subArraySumEqualsK {
    public static void sumEquals(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the values in the  array");
        for (int i = 0; i < n; i++) {
            System.out.print("enter [" + (i + 1) + "] element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the target ");
        int target=sc.nextInt();

//        System.out.println("count is"+count);
    }

}
