package acm;// https://www.acmicpc.net/problem/2750

import java.util.Arrays;
import java.util.Scanner;

public class acm_2750 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []numbers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}