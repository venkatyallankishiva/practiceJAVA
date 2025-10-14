import java.util.HashMap;
import java.util.Scanner;

public class SingleOccurrence {
    public static void find(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the values in the  array");
        for (int i = 0; i < n; i++) {
            System.out.print("enter [" + (i + 1) + "] element: ");
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> count=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int val=arr[i];
            if(count.containsKey(val)){
                int oldCount = count.get(val);
                count.put(val, oldCount + 1);
            }
            else {
                count.put(val,1);
            }
        }
        for(int a:count.keySet()){
            if(count.get(a)==1){
                System.out.println("the element with single occurrences:"+a);
                return;
            }
        }
        System.out.println("no single occurrence element found ");
    }
}
