package D1_2;

public class num_12 {
    static void chart(){
        System.out.println("  | 1 2 3 4 5 6 7 8 9 ");
        System.out.println("---+------------------");
        for(int row = 1; row <= 9; row++){
            for(int col = 0; col <= 9; col++){
                if(col == 0){
                    System.out.print(row+" | ");
                }else{
                    System.out.print(row+col+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        chart();
    }
}
