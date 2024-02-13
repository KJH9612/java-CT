// https://www.acmicpc.net/problem/31287

package acm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class acm_31287 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long k = Integer.parseInt(st.nextToken());
        String s = br.readLine();
        boolean flag = false;
        int x = 0, y = 0;

        k = k > (n >> 1) ? n >> 1 : k;

        for(int i = 0; i < s.length() * k; i++) {
            char dir = s.charAt(i % n);
            if(dir == 'U') {
                y++;
            }else if(dir == 'D'){
                y--;
            }else if(dir == 'R') {
                x++;
            }else if(dir == 'L') {
                x--;
            }

            if(x == 0 && y == 0){
                flag = true;
                break;
            }
        }

        System.out.println(flag ? "YES" : "NO");
    }
}
