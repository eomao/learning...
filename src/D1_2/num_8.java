package D1_2;

import java.util.Scanner;

public class num_8 {
    static int sumof(int a, int b){
        if(a >= b){
            return (a+b)*(a - b + 1)/2;
        }else{
            return (a+b)*(b - a + 1)/2;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sumof(a, b));
    }
}
