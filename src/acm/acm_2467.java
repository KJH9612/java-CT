package acm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class acm_2467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] n_lst = new int[n];
        int min_data = Integer.MAX_VALUE;
        int [] res_index = {0, n - 1};
        // 시작, 끝 포인터
        int s = 0, e = n - 1;

        // 값 입력
        for(int i = 0; i < n; i++){
            n_lst[i] = Integer.parseInt(st.nextToken());
        }

        while(s < e) {
            int v = n_lst[s] + n_lst[e];

            if(Math.abs(v) <= min_data) {
                res_index[0] = s;
                res_index[1] = e;
                min_data = Math.abs(v);
            }

            if(v >= 0) {
                e--;
            }else{
                s++;
            }
        }
        System.out.println(n_lst[res_index[0]] + " " + n_lst[res_index[1]]);
    }
}
