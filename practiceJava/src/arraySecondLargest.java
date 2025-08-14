import java.util.Scanner;

public class arraySecondLargest {
    static Scanner sc=new Scanner(System.in);
    public static void secondlargestelement(){
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+" elements into arrays");
        for(int i=0;i<n;i++){
            System.out.print("enter "+"["+(i+1)+"]"+"element");
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        int seclarge=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                int temp=largest;
                largest=arr[i];
                seclarge=temp;
            }
        }
        System.out.println("second largest element in the array is:"+seclarge);
    }

}
