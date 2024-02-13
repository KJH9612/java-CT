// https://www.acmicpc.net/problem/1972
package acm;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class acm_1972 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String input = sc.next();
            boolean flag = true;

            if (input.equals("*")){
                break;

            }

            for(int i = 0; i < input.length() - 1 && flag; i++){
                HashMap<String, String> m = new HashMap<>();
                for(int j = 0; j < input.length() - 1 - i; j++) {
                    String key = "" + input.charAt(j) + input.charAt(j + i + 1);

                    if(m.containsKey(key)) {
                        System.out.println(input + " is NOT surprising.");
                        flag = false;
                        break;
                    }
                    m.put(key, "");
                }
                m.clear();
            }
            if(flag){
                System.out.println(input + " is surprising.");
            }

        }

    }
}
