import java.util.Scanner;

public class containerWater {
    public static void mostWater(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the values in the  array");
        for (int i = 0; i < n; i++) {
            System.out.print("enter [" + (i + 1) + "] element: ");
            arr[i] = sc.nextInt();
        }
        int maxVal=0;
        for(int i=0;i<arr.length;i++){
           int minVal=0;
            for(int j=i+1;j<arr.length;j++){
                int shortest=Math.min(arr[i],arr[j]);
                minVal=shortest*(j-i);
            }
            maxVal=Math.max(minVal,maxVal);
        }
        System.out.println("container with most water"+maxVal);
    }
}
