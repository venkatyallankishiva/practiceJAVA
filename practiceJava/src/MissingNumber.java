import java.util.Scanner;

public class MissingNumber {
    public static void findMissingNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter the element at position "+i);
            arr[i]=sc.nextInt();
        }
        int totalsum=0;
        for(int i=0;i<=n;i++){
            totalsum+=i;
        }
        int sum=totalsum;
        for(int a:arr){
            sum-=a;
        }
        System.out.println("missing number"+sum);
    }
}
