import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        // Fast I/O Setup
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        
        String line = br.readLine();
        if (line == null) return;
        
        int t = Integer.parseInt(line.trim());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int count = 0;
            int currentMax = -1;
            
            // Process each element in the array
            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(st.nextToken());
                
                // If the current element is >= the max seen so far,
                // it will eventually be a "rightmost maximum" in some prefix.
                if (val >= currentMax) {
                    count++;
                    currentMax = val;
                }
            }
            out.println(count);
        }
        
        // Final flush to print all results
        out.flush();
        out.close();
    }
}