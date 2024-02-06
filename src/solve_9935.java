// https://www.acmicpc.net/problem/9935

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class solve_9935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> s = new Stack<>();
        String str = br.readLine();
        String boomStr = br.readLine();
        StringBuilder res = new StringBuilder();
        int bs_len = boomStr.length();
        boolean flag;

        for(int i = 0; i < str.length(); i++) {
            flag = true;

            s.push(str.charAt(i));

            if(s.size() < bs_len)
                continue;

            for(int j = 0; j < bs_len; j++) {
                if(s.get(s.size() - bs_len + j) != boomStr.charAt(j)){
                    flag = false;
                    break;
                }
            }

            for(int j=0; j < bs_len && flag; j++) {
                s.pop();
            }
        }

        for (Character character : s) {
            res.append(character);
        }

        System.out.println(res.length() == 0 ? "FRULA" : res);
//        System.out.println(res.isEmpty() ? "FRULA" : res); error

    }
}
