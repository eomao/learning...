package D2_1;

import java.util.Arrays;
import java.util.Random;

public class num_5 {
    static void rcopy(int[] a, int[] b){
        int index = a.length - 1;
        for(int i: b){
            a[index] = i;
            index--;
        }
    }
    public static void main(String[] args){
        Random rnd = new Random();
        int[] a = new int[10];
        int[] b = new int[10];
        for(int i = 0; i < b.length; i++){
            b[i] = rnd.nextInt(100);
        }
        System.out.println("배열 a: "+ Arrays.toString(a));
        System.out.println("배열 b: "+ Arrays.toString(b));
        rcopy(a, b);
        System.out.println("배열 a: "+ Arrays.toString(a));
        System.out.println("배열 b: "+ Arrays.toString(b));
    }
}
