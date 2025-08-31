import java.util.Arrays;
import java.util.Scanner;

public class equalArrays {
    public static boolean equal(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] a = new int[n];
        int [] b=new int[n];
        System.out.println("enter " + n + " elements into 1st array");
        for (int i = 0; i < n; i++) {
            System.out.print("enter " + "[" + (i + 1) + "]" + "element");
            a[i] = sc.nextInt();
        }
        System.out.println("enter " + n + " elements into 2nd array");
        for (int i = 0; i < n; i++) {
            System.out.print("enter " + "[" + (i + 1) + "]" + "element");
            b[i] = sc.nextInt();
        }

        if(a.length!=b.length){
            return false;
        }
        int count=0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i]==b[i]){
                count++;
            }
        }
        if(count==a.length){
            return true;
        }
        return false;

    }
}
