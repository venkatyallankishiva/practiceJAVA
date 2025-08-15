import java.util.Scanner;

public class FindDuplicatesInArray {
    public static void duplicatesInArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter " + n + " elements into arrays");
        for (int i = 0; i < n; i++) {
            System.out.print("enter " + "[" + (i + 1) + "]" + "element");
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }
    }
}
