import java.util.Scanner;

public class removeDuplicates {
 public static void remove(){
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the size of the array");
  int n = sc.nextInt();
  int arr[] = new int[n];
  System.out.println("enter the array elements");
  for(int i=0;i<n;i++){
   arr[i]=sc.nextInt();
  }
//int index=1;
//for(int i=1;i<n;i++){
//    if(arr[i]!=arr[i-1]){
//        arr[index++]=arr[i];
//    }
//}
//for(int j=0;j<index;j++){
//    System.out.print(arr[j]+" ");
//}

     int i=0;
  for(int j=1;j<arr.length;j++){
      if(arr[j]!=arr[i]){
          i++;
          arr[i]=arr[j];
      }
  }

  for(int k=0;k<i+1;k++){
      System.out.print(arr[k]);
  }

 }
}
