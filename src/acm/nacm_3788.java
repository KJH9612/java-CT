package acm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class nacm_3788 {
    static String cipher = "";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        while((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);
            String type = st.nextToken();
            String result = "";

            if(type.equals("ENCRYPT")) {
                result = "RESULT: " + encrypt(input);
            }else if(type.equals("CIPHER")) {
                cipher = st.nextToken();
            }else if(type.equals("DECRYPT")) {
                result = decrypt(input);
            }

            System.out.println(result);
        }
    }

    public static String encrypt(String message) {
        StringBuilder res = new StringBuilder();
        for(char c : message.toCharArray()) {
            if (Character.isAlphabetic(c)) {

            }else {
                res.append(c);
            }

        }

        return res.toString();
    }

    public static String decrypt(String message) {
        return "";
    }
}
