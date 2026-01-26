import java.util.Arrays;
import java.util.Scanner;

public class medianOfArray {
    public static void median(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        System.out.println("enter the elements of array");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        double median=0;
        if(size%2==0){
           median=(double) (arr[size/2]+arr[(size/2)-1])/2 ;
            System.out.println("median of the array is"+median);
        }
        else {
            median=arr[size/2];
            System.out.println("median of the array is:"+median);
        }
    }
}
