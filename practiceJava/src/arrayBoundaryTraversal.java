import java.util.Scanner;

public class arrayBoundaryTraversal {
    public static void arrayBoundaryElements(){
        Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number of rows:   ");
            int n = sc.nextInt();
            System.out.print("Enter the number of columns: ");
            int m = sc.nextInt();
            int[][] arr = new int[n][m];
            System.out.println("Enter the elements of the array:");
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int rt=0,cl=0,rb=n-1,cr=m-1;
            for(int i=cl;i<=cr; i++) {
                System.out.print(arr[rt][i] + " ");
            }
            rt++;
            for(int i=rt;i<=rb; i++) {
                System.out.print(arr[i][cr] + " ");
            }
            cr--;
            for(int i=cr;i>=cl; i--) {
                System.out.print(arr[rb][i] + " ");
            }
            rb--;
            for(int i=rb;i>=rt; i--) {
                System.out.print(arr[i][cl] + " ");
            }
            cl++;
            System.out.println();


        }
    }


