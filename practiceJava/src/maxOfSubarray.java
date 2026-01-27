import java.util.Scanner;

public class maxOfSubarray {
    public static void maxOfAllSubArrays() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the values in the  array");
        for (int i = 0; i < n; i++) {
            System.out.print("enter [" + (i + 1) + "] element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the subarray size");
        int k=sc.nextInt();
        int left=0;
        int right=k-1;
        int val=Integer.MIN_VALUE;
        int ind=0;
        int []ans=new int[arr.length];
        while(right<arr.length){
            for(int i=left;i<=right;i++){
                if(arr[i]>val){
                    val=arr[i];
                }
            }
            left++;
            right++;
            ans[ind++]=val;
        }
        for(int i=0;i<ind;i++){
            System.out.print(ans[i]+" ");
        }

    }
}
