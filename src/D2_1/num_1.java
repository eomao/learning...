package D2_1;
import java.util.Random;

public class num_1 {
    static int maxOf(int[] a){
        int max = 0;
        for(int i: a){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args){
        Random rnd = new Random();
        int people = rnd.nextInt(10);
        int[] height = new int[people];
        System.out.println("킷값은 다음과 같습니다.");
        for(int i = 0; i < people; i++){
            height[i] = rnd.nextInt(90) + 100;
            System.out.println(height[i]);
        }
        System.out.println("키의 최댓값은 "+maxOf(height)+"입니다.");

    }

}
