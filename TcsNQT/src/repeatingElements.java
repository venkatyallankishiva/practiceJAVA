import java.util.HashMap;
import java.util.Scanner;

public class repeatingElements {
    public static void repeat(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        System.out.println("enter the elements of array");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int count=map.get(arr[i]);
                map.put(arr[i],count+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int count=0;
        for(int val:map.keySet()){
            if(map.get(val)>1){
                if(count==0) {
                    System.out.print(val);
                    count++;
                }
                else{
                System.out.print(","+val);
            }
        }
        }
    }
}
