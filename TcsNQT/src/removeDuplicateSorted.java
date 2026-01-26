import java.util.Scanner;

public class removeDuplicateSorted {
    public static void remove(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        System.out.println("enter the elements of array");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        for(int j=0;j<size-1;j++){
            if(arr[j]!=arr[j+1]){
                arr[index++]=arr[j];
            }
        }
        arr[index]=arr[size-1];
        for (int i=0;i<=index;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
