import java.util.Scanner;

public class arrayLargest {
    static Scanner sc=new Scanner(System.in);
    public static void largestelement(){
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+" elements into arrays");
        for(int i=0;i<n;i++){
            System.out.print("enter "+"["+(i+1)+"]"+"element");
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("largest element in the given array is: "+largest);
    }


}

