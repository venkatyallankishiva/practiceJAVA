import java.util.Scanner;

public class pairSum {
    public static void targetSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target sum value you wanted");
        int target = sc.nextInt();
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        int i = 0;
        int j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                System.out.println(arr[i]+","+arr[j]);
                break;

            }
            else if(sum<target){
                i++;
            }
            else{
                j--;
            }
        }















//        int i=0;
//        while (i < arr.length) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target) {
//                    System.out.println(arr[i] + "," + arr[j]);
//                    break;
//                }
//            }
//            i++;
//        }
    }
}
