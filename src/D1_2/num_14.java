package D1_2;

import java.util.Scanner;

public class num_14 {
    static void triangleLB(int n){
        for(int row = 0; row < n; row++){
            for(int col = 0; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangleLU(int n){
        for(int row = n; row > 0; row--){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangleRB(int n){
        for(int row = n; row > 0; row--){
            for(int col = 1; col <= n; col++){
                if(col >= row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void triangleRU(int n){
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                if(col >= row){
                    System.out.print("*");
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
        triangleLB(n);
        triangleRB(n);
        triangleLU(n);
        triangleRU(n);
    }
}
