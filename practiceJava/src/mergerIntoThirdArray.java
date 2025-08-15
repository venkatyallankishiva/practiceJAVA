import java.util.Arrays;
import java.util.Scanner;

public class mergerIntoThirdArray {
    public static void twoArrays(){
        Scanner sc=new Scanner(System.in);
        //*******CREATING 1ST ARRAY******
        System.out.println("enter the size of 1st array");
        int n=sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("enter " + n + " elements into arrays");
        for (int i = 0; i < n; i++) {
            System.out.print("enter " + "[" + (i + 1) + "]" + "element");
            arr1[i] = sc.nextInt();
        }
        //******CREATING 2ND ARRAY*******
        System.out.println("enter the size of 2nd array");
        int m=sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("enter " + m + " elements into arrays");
        for (int i = 0; i < m; i++) {
            System.out.print("enter " + "[" + (i + 1) + "]" + "element");
            arr2[i] = sc.nextInt();
        }

        int arr3[]=new int[arr1.length+arr2.length];
        int j=0;
        int i=0;
        for(int k=0;k<n+m;k++){
            if(i<n && j < m && arr1[i] < arr2[j]){
                arr3[k]=arr1[i];
                i++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
            }
        }
        System.out.print(Arrays.toString(arr3));
    }
}
