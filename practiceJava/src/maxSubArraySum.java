import java.util.Scanner;

public class maxSubArraySum {
    public static void subArraysum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the values in the  array");
        for (int i = 0; i < n; i++) {
            System.out.print("enter [" + (i + 1) + "] element: ");
            arr[i] = sc.nextInt();
        }
        //brute force approach
        int currsum=0,maxsum=Integer.MIN_VALUE;
//        for(int st=0;st<arr.length;st++){
//            currsum=0;
//            for(int end=st;end<arr.length;end++){
//                currsum+=arr[end];
//                maxsum=Math.max(currsum,maxsum);
//            }
//        }

        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            maxsum=Math.max(currsum,maxsum);
            if(currsum<0){
                currsum=0;
            }
        }
        System.out.println("maximum subarray sum:"+maxsum);
    }
}
