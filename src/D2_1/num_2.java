package D2_1;
import java.util.Arrays;
import java.util.Random;

public class num_2 {
    static void swap(int[] a, int num1, int num2){
        System.out.println("a["+num1+"]과 a["+num2+"]를 교환합니다.");
        int temp = a[num1];
        a[num1] = a[num2];
        a[num2] = temp;
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args){
        Random rnd = new Random();
        int[] a = new int[7];
        for(int i = 0; i < 5; i++){
            a[i] = rnd.nextInt(10);
        }
        System.out.println(Arrays.toString(a));
        for(int i = 0; i < a.length/2; i++){
            swap(a,i,a.length-i-1);
        }
        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
