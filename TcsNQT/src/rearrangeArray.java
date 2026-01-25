import java.util.Arrays;
import java.util.Scanner;

public class rearrangeArray {
    public static void incredecreorder(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        System.out.println("enter the elements of array");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int left=size/2;
        int right=size-1;
        while (left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
