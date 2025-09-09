import java.util.Scanner;

public class bubbleSort {
    public static void bubblesort(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the element at index "+i);
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                     int temp=arr[j+1];
                     arr[j+1]=arr[j];
                     arr[j]=temp;
                }
            }
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
