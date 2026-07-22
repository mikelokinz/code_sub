import java.util.*;
 
public class PassingBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
 
            boolean[] visited = new boolean[n+1];
 
            int pos = 1;
            visited[pos] = true;
 
            for(int i=0;i<n;i++){
                if(s.charAt(pos-1) == 'R')
                    pos++;
                else
                    pos--;
 
                visited[pos] = true;
            }
 
            int count = 0;
            for(int i=1;i<=n;i++)
                if(visited[i]) count++;
 
            System.out.println(count);
        }
    }
}