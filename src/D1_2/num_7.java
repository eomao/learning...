package D1_2;

import java.util.Scanner;

public class num_7 {
    static int sum(int n){
        return (1+n)*n/2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
