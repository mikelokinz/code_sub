import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int t = sc.nextInt();
 
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
           
            long c = sc.nextLong(); 
            long k = sc.nextLong();
            
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            
       
            Arrays.sort(a);
            
            for (int i = 0; i < n; i++) {
                if (c < a[i]) {
                   
                    break; 
                }
                
               
                long flipsUsed = Math.min(k, c - a[i]);
                
               
                k -= flipsUsed;
                c += (a[i] + flipsUsed);
            }
            
            out.append(c).append("
");
        }
        
       
        System.out.print(out);
    }
   
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
 
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}