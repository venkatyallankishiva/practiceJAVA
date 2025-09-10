import java.util.Scanner;

public class LongCommonPrefix {
    public static void prefix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        String s[] = new String[n];
        System.out.println("enter the values in the string array");
        for (int i = 0; i < n; i++) {
            System.out.print("enter [" + (i + 1) + "] element: ");
            s[i] = sc.next();
        }

        if (s.length == 0) {
            System.out.println("no longest prefix exists");
            return;
        }
        String ans = "";
        String first = s[0];
        for (int k = 0; k < first.length(); k++) {
            char ch = first.charAt(k);
            boolean allMatch = true;
            for (int j = 1; j < n; j++) {
                if (k >= s[j].length() || s[j].charAt(k) != ch) {
                    allMatch = false;
                    break;
                }
            }

            if (allMatch) {
                ans += ch;
            } else {
                break;
            }
        }

        System.out.println("the longest common prefix: " + ans);
    }

    public static void main(String[] args) {
        prefix();
    }
}
