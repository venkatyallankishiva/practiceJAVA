import java.util.Arrays;
import java.util.Scanner;

public class removeElement {
    public static void removeVal(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+" elements into arrays");
        for(int i=0;i<n;i++) {
            System.out.print("enter " + "[" + (i + 1) + "]" + "element");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the value to be removed");
        int val=sc.nextInt();
int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                count++;
                arr[i]=Integer.MAX_VALUE;
            }
        }
        Arrays.sort(arr);
        System.out.println("the number of given value occurences are: "+(arr.length-count));
        for(int a:arr){
            System.out.print(a+" ");
        }

    }
}
