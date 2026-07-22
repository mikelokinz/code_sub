import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int first = s.indexOf('1');
            
            if (first == -1) {
                System.out.println((n + 2) / 3);
                continue;
            }
            
            int last = s.lastIndexOf('1');
            int additionalStudents = 0;
            int currentStudents = 0;
            
            additionalStudents += (first + 1) / 3;
            additionalStudents += (n - 1 - last + 1) / 3;
            
            int prev = first;
            currentStudents++;
            
            for (int i = first + 1; i <= last; i++) {
                if (s.charAt(i) == '1') {
                    currentStudents++;
                    int gap = i - prev - 1;
                    additionalStudents += gap / 3;
                    prev = i;
                }
            }
            
            System.out.println(currentStudents + additionalStudents);
        }
        sc.close();
    }
}