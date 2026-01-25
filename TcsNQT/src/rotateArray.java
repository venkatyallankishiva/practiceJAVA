import java.util.Scanner;

public class rotateArray {
    public static void rotate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        System.out.println("enter the elements of array");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number of steps to rotate");
        int k=sc.nextInt();
      int left=0,right=k-1;
      while(left<right){
          int temp=arr[left];
          arr[left]=arr[right];
          arr[right]=temp;
          left++;
          right--;
      }
      left=k;
      right=size-1;
      while (left<right){
          int temp=arr[left];
          arr[left]=arr[right];
          arr[right]=temp;
          left++;
          right--;
      }
      left=0;
      right=size-1;
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
