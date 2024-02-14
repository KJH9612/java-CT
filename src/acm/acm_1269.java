// https://www.acmicpc.net/problem/1269
// edit
package acm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class acm_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        HashSet<Integer> n_l = new HashSet<>();
        HashSet<Integer> m_l = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            n_l.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            m_l.add(Integer.parseInt(st.nextToken()));
        }

        System.out.println(counter(n_l, m_l) + counter(m_l, n_l));
    }

    public static int counter(HashSet<Integer> a, HashSet<Integer> b) {
        int count = 0;
        for(Integer i : b){
            if(!a.contains(i)) {
                count++;
            }
        }
        return count;
    }
}
