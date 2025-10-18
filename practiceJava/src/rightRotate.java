import java.util.Scanner;

public class rightRotate {
    public static void rotateRight(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the values in the  array");
        for (int i = 0; i < n; i++) {
            System.out.print("enter [" + (i + 1) + "] element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the no of right rotations");
        int k=sc.nextInt();
        k=k%arr.length;
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);
        System.out.println("array after right rotations is:");
        for(int a:arr){
            System.out.print(a+" ");
        }

    }
    static void reverse(int a[],int st,int end){
        while(st<end){
            int temp=a[st];
            a[st]=a[end];
            a[end]=temp;
            st++;
            end--;
        }
    }
}
