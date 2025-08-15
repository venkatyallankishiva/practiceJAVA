import java.util.Scanner;

public class commonElementsInArray {
    public static void commonInArray(){

        System.out.println("*****************INSTRUCTIONS****************" +
                "\n1.do not enter duplicate values " +
                "\n2.it is not required to have a sorted array"+
        "\n***************************************************");

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
        //*******CREATING THE 3RD ARRAY******
        System.out.println("enter the size of 3rd array");
        int p=sc.nextInt();
        int[] arr3 = new int[p];
        System.out.println("enter " + p + " elements into arrays");
        for (int i = 0; i < p; i++) {
            System.out.print("enter " + "[" + (i + 1) + "]" + "element");
            arr3[i] = sc.nextInt();
        }

        //-----CHECKING FOR COMMON ELEMENTS IN THE ARRAY!!!----
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr1[i]==arr2[j]){
                    for(int k=0;k<p;k++){
                        if(arr3[k]==arr1[i]){
                            System.out.print(arr1[i]+" ");
                        }
                    }
                }
            }
        }
        System.out.print("are the unique elements in the 3 arrays");
    }
}
