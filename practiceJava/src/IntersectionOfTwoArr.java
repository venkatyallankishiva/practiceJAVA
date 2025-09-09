import java.util.Scanner;

public class IntersectionOfTwoArr {
    public static void intersection(){
        Scanner sc=new Scanner(System.in);
        //*******CREATING 1ST ARRAY******
        System.out.println("enter the size of 1st array");
        int n=sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("enter " + n + " elements into arrays");
        for (int i = 0; i < n; i++) {
            System.out.print("enter " + "[" + (i + 1) + "]" + "element");
            arr1[i] = sc.nextInt();
        }
        //******CREATING 2ND ARRAY*******
        System.out.println("enter the size of 2nd array");
        int m=sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("enter " + m + " elements into arrays");
        for (int i = 0; i < m; i++) {
            System.out.print("enter " + "[" + (i + 1) + "]" + "element");
            arr2[i] = sc.nextInt();
        }
        int arr3[]=new int[10];
        int count=0;
        int index=0;
        for(int i=0;i<n;i++){
            int current=arr1[i];
            for(int j=0;j<m;j++){
                if(arr2[j]==current){
                    arr3[index++]=current;
                    count++;
                    break;
                }
            }
        }
        System.out.println("the intersection of both arrays");
        for(int i=0;i<count;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
