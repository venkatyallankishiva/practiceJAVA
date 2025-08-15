
import java.util.Scanner;

public class removeDuplicate {

    public static  void duplicate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements into arrays");
        for (int i = 0; i < n; i++) {
            System.out.print("enter " + "[" + (i + 1) + "]" + "element");
            arr[i] = sc.nextInt();
        }
        int i=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    arr[i+1]=arr[j];
                    i++;
                }
            }
        System.out.println("there "+(i+1)+" unique elements in the array!!");
            //this gives only unique elements from the array.
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
