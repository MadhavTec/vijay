package techolution;

/**
 * Created by vijay on 10/14/2017.
 */
public class InTheFuture {
    public static void main(String[] args) {
        int a = 4;
        int k = 5;
        int p = 1;
        System.out.println(minNum(a,k,p));

    }
    static int minNum(int a,int k,int p){
        int minDays = 1;
        Boolean isTrue = true;
        int tempA = a+p;
        int tempK = k;
        while (isTrue){
            System.out.println(tempA+" "+tempK);
            if(tempK > tempA){
                break;
            }
            if(tempK>=100){
                minDays = -1;
                break;
            }
            tempA += a;
            tempK += k;
            minDays++;
            System.out.println(isTrue);
        }
        return minDays;
    }
}
