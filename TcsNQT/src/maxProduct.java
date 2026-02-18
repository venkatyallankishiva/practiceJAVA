import java.util.Scanner;

public class maxProduct {
    public static void product(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        System.out.println("enter the elements of array");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int prod=1;
        for(int i=0;i<size;i++){
            prod=1;
            for(int j=i;j<size;j++){
                prod=prod*arr[j];

            max=Math.max(prod,max);
        }
        }
        System.out.print("maximum product"+max);
    }
}
