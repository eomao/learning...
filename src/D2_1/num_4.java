package D2_1;
import java.util.Arrays;
import java.util.Random;

public class num_4 {
    static void copy(int[] a, int[] b){
        int index = 0;
        for(int i: b){
            a[index] = i;
            index++;
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
        copy(a, b);
        System.out.println("배열 a: "+ Arrays.toString(a));
        System.out.println("배열 b: "+ Arrays.toString(b));
    }
}
