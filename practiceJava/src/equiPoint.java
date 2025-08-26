import java.util.Scanner;

public class equiPoint {
    public static void equilibriumPoint(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of  array");
        int n=sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("enter " + n + " elements into arrays");
        for (int i = 0; i < n; i++) {
            System.out.print("enter " + "[" + (i + 1) + "]" + "element");
            arr1[i] = sc.nextInt();
        }
        int count=0;
        int sum=0;
        int sum1=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                sum+=arr1[j];
            }
            for(int k=i+1;k<n;k++){
                sum1+=arr1[k];
            }
            if(sum==sum1) {
                System.out.println("equilibrium point is" + (i + 1));
                count++;
                break;
            }
        }
        sum=0;
        sum1=0;
        if(count==0){
            System.out.println("there doesn't exist any such point in the array");
        }

    }
}
