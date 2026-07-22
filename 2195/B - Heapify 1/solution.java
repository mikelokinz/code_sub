import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean possible = true;
            
            for (int i = 1; i <= n; i++) {
                int val = Integer.parseInt(st.nextToken());
                if (getOddPart(val) != getOddPart(i)) {
                    possible = false;
                }
            }
            
            System.out.println(possible ? "YES" : "NO");
        }
    }
 
    private static int getOddPart(int n) {
        if (n == 0) return 0;
        return n / Integer.lowestOneBit(n);
    }
}