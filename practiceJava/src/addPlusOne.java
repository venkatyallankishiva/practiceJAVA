import java.util.Scanner;

public class addPlusOne {
    public static void addOne(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements into array");
        for (int i = 0; i < n; i++) {
            System.out.print("enter [" + (i + 1) + "] element: ");
            arr[i] = sc.nextInt();
        }

        int num = 0;
        for (int i = 0; i < n; i++) {
            num = num * 10 + arr[i];
        }

        num = num + 1;

        int temp = num, digits = 0;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        int[] ans = new int[digits];
        for (int i = digits - 1; i >= 0; i--) {
            ans[i] = num % 10;
            num = num / 10;
        }

        System.out.println("the answer array after plus one is:");
        for (int a : ans) {
            System.out.print(a + " ");
        }
    }
}
