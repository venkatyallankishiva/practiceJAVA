import java.util.Scanner;

public class InsertionSort {
    public static void insertion(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the element at index "+i);
            arr[i]= sc.nextInt();
        }
        int currentValue=0;
        for(int i=1;i<n;i++){
            currentValue=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>currentValue){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=currentValue;
        }
        System.out.print("The sorted array is :");
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
