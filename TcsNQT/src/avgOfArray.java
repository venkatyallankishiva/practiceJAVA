import java.util.Arrays;
import java.util.Scanner;

public class avgOfArray {
    public static void avg(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        System.out.println("enter the elements of array");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        double sum=0;
        for(int i=0;i<size;i++){
           sum+=(double) arr[i];
        }
        System.out.println("average os the array elements "+sum/size);
    }
}
