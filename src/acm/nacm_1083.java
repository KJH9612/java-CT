package acm;// https://www.acmicpc.net/problem/1083
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class nacm_1083 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int []arr = new int[n];
        int sort_count = Integer.parseInt(br.readLine());
        int current_count = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n - 1; i++) {
            if(sort_count == current_count){
                break;
            }

            if(arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                current_count++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

//    public int[] proc(int []arr) {
//    }
}
