import java.util.Scanner;

public class sumZero {
    public static void twoSumZero(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of  array");
        int n=sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("enter " + n + " elements into arrays");
        for (int i = 0; i < n; i++) {
            System.out.print("enter " + "[" + (i + 1) + "]" + "element");
            arr1[i] = sc.nextInt();
        }
         String ans="";
        int index=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr1[i]+arr1[j]==0){
                   ans+="{"+i+","+j+"}";
                }
            }
        }
        System.out.println("the pair of indices whose elements sum is zer0"+ans);
    }
}
