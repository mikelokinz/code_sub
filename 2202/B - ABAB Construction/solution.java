import java.io.*;
import java.util.*;
 
public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                    return null;
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
 
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        String ts = fr.next();
        if (ts != null) {
            int t = Integer.parseInt(ts);
            while (t-- > 0) {
                int n = fr.nextInt();
                String x = fr.next();
                if (solve(n, x)) {
                    out.println("YES");
                } else {
                    out.println("NO");
                }
            }
        }
        out.flush();
        out.close();
    }
 
    static boolean solve(int n, String x) {
        int l0 = 0, r0 = 0;
        int l1 = n + 1, r1 = -1;
        for (int i = 0; i < n; i++) {
            char target = x.charAt(i);
            int nl0 = n + 1, nr0 = -1;
            int nl1 = n + 1, nr1 = -1;
            if (l0 <= r0) {
                if (target == 'a' || target == '?') {
                    nl1 = Math.min(nl1, l0 + 1);
                    nr1 = Math.max(nr1, r0 + 1);
                }
                char rightChar = ((n - i) % 2 != 0) ? 'a' : 'b';
                if (target == rightChar || target == '?') {
                    nl0 = Math.min(nl0, l0);
                    nr0 = Math.max(nr0, r0);
                }
            }
            if (l1 <= r1) {
                if (target == 'b' || target == '?') {
                    nl0 = Math.min(nl0, l1 + 1);
                    nr0 = Math.max(nr0, r1 + 1);
                }
                char rightChar = ((n - i + 1) % 2 != 0) ? 'a' : 'b';
                if (target == rightChar || target == '?') {
                    nl1 = Math.min(nl1, l1);
                    nr1 = Math.max(nr1, r1);
                }
            }
            l0 = nl0; r0 = nr0;
            l1 = nl1; r1 = nr1;
            if (l0 > r0 && l1 > r1) return false;
        }
        return true;
    }
}