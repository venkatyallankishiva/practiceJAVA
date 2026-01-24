import java.util.Scanner;

public class happynumber {
    public static void number(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n =sc.nextInt();
        while (n != 1 && n != 4) {
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }

            n = sum;
        }

        if (n == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
