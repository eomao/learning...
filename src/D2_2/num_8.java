package D2_2;


public class num_8 {
    static class YMD{
        int Y;
        int M;
        int D;
        YMD(int y, int m, int d){
            Y = y;
            M = m;
            D = d;
        }
        YMD after(int n){
            int newY = Y;
            int newM = M;
            int newD = D + n;
            while(newD > 28){
                if (newM == 2) {
                    newM++;
                    newD -= 28;
                } else if ((newM <= 7 && newM % 2 == 1) || (newM > 7 && newM % 2 == 0)) {
                    if (newD > 31) {
                        newM++;
                        newD -= 31;
                    }else{
                        break;
                    }
                } else {
                    if (newD > 30) {
                        newM++;
                        newD -= 30;
                    }else{
                        break;
                    }
                }
            }
            while(newM > 12){
                newM -= 12;
                newY++;
            }
            return new YMD(newY, newM, newD);
        }
        YMD before(int n){
            int newY = Y;
            int newM = M;
            int newD = D - n;
            while(newD <= 0){
                if(newM == 3){
                    newM--;
                    newD += 28;
                }else if((newM <= 7 && newM%2 == 0) || (newM > 7 && newM%2 == 1)){
                    newM--;
                    newD += 31;
                }else{
                    newM--;
                    newD += 30;
                }
            }
            while(newM <= 0){
                newY--;
                newM += 12;
            }
            return new YMD(newY, newM, newD);
        }
        void print(){
            System.out.println(Y+"년 "+M+"월 "+D+"일");
        }
    }
    public static void main(String[] args){
        YMD date = new YMD(2025, 5, 17);
        date.after(365).print();
        date.before(365).print();
    }
}
