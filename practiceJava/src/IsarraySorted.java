import java.util.Scanner;

public class IsarraySorted {
    static Scanner sc=new Scanner(System.in);
    public static void arraysorted(){
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+" elements into arrays");
        for(int i=0;i<n;i++){
            System.out.print("enter "+"["+(i+1)+"]"+"element");
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++) {
            if (arr[i-1] <= arr[i]) {
                continue;
            } else {
                System.out.println("the array is not sorted");
                break;
            }
        }
    }
}
