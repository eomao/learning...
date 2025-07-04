package D1_2;

import java.util.Scanner;

public class num_9 {
    static int de(int a, int b){
        if(a >= b){
            return -1;
        }else{
            return b-a;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("a값: "); int a = sc.nextInt();
        System.out.println("b값: "); int b = sc.nextInt();
        while (true){
            int res = de(a, b);
            if (res == -1) {
                System.out.println("a보다 큰 값을 입력하세요!");
                System.out.println("b값: ");
                b = sc.nextInt();
            } else {
                System.out.println("b-a는 "+res+"입니다.");
                break;
            }
        }
    }
}
