import java.util.Scanner;

public class arraySteps {
    public static void steps() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements into arrays");
        for (int i = 0; i < n; i++) {
            System.out.print("enter " + "[" + (i + 1) + "]" + "element");
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i = i + arr[i]) {
            if (arr[i] == 0) {
                System.out.println("i am stuck");
                break;
            }
            count++;
            if (count > n) {
                System.out.println("infinite");
                break;
            }
        }
        System.out.println("steps" + count);
    }
}
