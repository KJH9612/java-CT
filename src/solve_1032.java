// https://www.acmicpc.net/problem/1032

import java.util.Scanner;

public class solve_1032 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String []commands = null;

        int n = sc.nextInt();
        int len = -1;
        StringBuilder res = new StringBuilder();

        commands = new String[n];

        for(int i = 0; i < n; i++){
            commands[i] = sc.next();
        }

        len = commands[0].length();

        for(int i = 0; i < len; i++){
            char c = commands[0].charAt(i);
            boolean isSame = true;

            for(int j = 1; j < commands.length; j++) {
                if (c != commands[j].charAt(i)) {
                    isSame = false;
                    break;
                }
            }

            if (isSame) {
                res.append(c);
            }else{
                res.append("?");
            }
        }

        System.out.println(res);

    }
}
