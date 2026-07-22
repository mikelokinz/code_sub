import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String s = sc.next();
                int n = s.length();
                int badPairs = 0;
 
                for (int i = 0; i < n - 1; i++) {
                    if (s.charAt(i) == s.charAt(i + 1)) {
                        badPairs++;
                    }
                }
 
                if (badPairs <= 2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}