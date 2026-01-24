import java.util.Scanner;

public class secondLargeSmallElement {
    public static void largesmall(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        System.out.println("enter the elements of array");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int smallest=Integer.MAX_VALUE;
        int secsmall=Integer.MAX_VALUE;
        int seclarge=Integer.MIN_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]<smallest) {
                secsmall = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<secsmall && arr[i]!=smallest){
                secsmall=arr[i];
            }
        }
        for(int i=0;i<size;i++){
            if(arr[i]>largest){
                seclarge=largest;
                largest=arr[i];
            }
            else if(arr[i]>seclarge && arr[i]!=largest){
                seclarge=arr[i];
            }
        }

        System.out.println("the second smallest element is:"+secsmall+", the second largest element is:"+seclarge);
    }

}
