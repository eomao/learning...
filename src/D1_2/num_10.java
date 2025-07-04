package D1_2;

import java.util.Scanner;

public class num_10 {
    static int count(int n){
        int cnt = 1;
        while (n/10 != 0){
            cnt++;
            n /= 10;
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }
}
