// https://www.acmicpc.net/problem/11728

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a_len = Integer.parseInt(st.nextToken());
        int b_len = Integer.parseInt(st.nextToken());

        int [] a = new int[a_len];
        int [] b = new int[b_len];

        int p1 = 0, p2 = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a_len; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < b_len; i++){
            b[i] = Integer.parseInt(st.nextToken());
        }

        while(p1 < a_len && p2 < b_len) {
            sb.append(a[p1] <= b[p2] ? a[p1++] : b[p2++]).append(" ");
        }

        while(p1 < a_len) {
            sb.append(a[p1++]).append(" ");
        }

        while(p2 < b_len) {
            sb.append(b[p2++]).append(" ");
        }

        System.out.println(sb);
    }
}
