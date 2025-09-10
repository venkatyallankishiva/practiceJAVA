import java.util.Scanner;

public class selectionSort {
    public static void selection(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the element at index "+i);
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int small=i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[small]){
                    small=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[small];
            arr[small]=temp;
        }
        System.out.println("Th array after sorting : ");
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
