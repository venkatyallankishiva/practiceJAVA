import java.util.Scanner;
public class leftRotation {
    public static void leftRotate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the values in the  array");
        for (int i = 0; i < n; i++) {
            System.out.print("enter [" + (i + 1) + "] element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the no of left rotations");
        int k=sc.nextInt();
        k=k%arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        System.out.println("array after left rotations is:");
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
