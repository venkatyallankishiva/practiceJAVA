import java.util.Scanner;
public class arrayCreate {
    public static void create() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter " + n + " elements into arrays");
        for (int i = 0; i < n; i++) {
            System.out.print("enter " + "[" + (i + 1) + "]" + "element");
            arr[i] = sc.nextInt();
        }
    }
}
