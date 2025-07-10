package D2_1;
import java.util.Random;

public class num_3 {
    static int sumOf(int[] a){
        int sum = 0;
        for(int i: a){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        Random rnd = new Random();
        int[] a = new int[rnd.nextInt(10)];
        for(int i = 0; i < a.length; i++){
            a[i] = rnd.nextInt(100);
        }
        System.out.println(sumOf(a));
    }
}
