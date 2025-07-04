package D1_2;

import java.util.Scanner;

public class num_16 {
    static void pyramid(int n){
    for(int row = 1; row <= n; row++){
        for(int col = 0; col < n*2 - 1; col++){
            if(col>= n - row && col < n +row -1){
                System.out.print(row);
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pyramid(n);
    }
}
