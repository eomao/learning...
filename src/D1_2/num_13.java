package D1_2;

import java.util.Scanner;

public class num_13 {
    static void square(int n){
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("정사각형을 출력합니다.");
        System.out.println("변의 길이: ");  int n = sc.nextInt();
        square(n);

    }
}
