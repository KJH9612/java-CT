package acm;

import java.util.Scanner;

public class acm_1309 {
    static final int mod = 9901;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100001];
        arr[0] = 1;
        arr[1] = 3;

        for(int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 1] * 2 + arr[i - 2]) % mod;
        }

        System.out.println(arr[n]);
    }
}
