package D2_1;

import java.util.Scanner;

public class num_6 {
    static int dno = 0;
    static int[] revert(int num, int a){
        int[] result = new int[100];
        int i = 0;
        while (a != 0){
            result[i] = a%num;
            dno++;
            a /= num;
            i++;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("10진수를 기수 변환합니다.");
        System.out.println("변환하는 음이 아닌 정수: ");
        int a = sc.nextInt();
        System.out.println("어떤 진수로 변환할까요?");
        int num = sc.nextInt();
        int[] result = revert(num, a);
        System.out.print("변환 결과는 ");
        for(int i = dno-1; i >= 0; i--){
            System.out.print(result[i]);
        }
        System.out.println("입니다.");
    }
}
