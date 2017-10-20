package techolution;

/**
 * Created by vijay on 10/14/2017.
 */
public class BuyingSowTickets {
    public static void main(String[] args) {
        int tickets[] = {5,5,2,3};
        int p = 3;
        System.out.println(waitingTime(tickets,p));
    }
    static long waitingTime(int[] tickets,int p){
        long waitingTime = 0;
        for (int i = 0; i < tickets.length; i++) {
            waitingTime += tickets[p]>=tickets[i]?tickets[i]:tickets[p];
            if (i > p) {
                waitingTime--;
            }
        }
        return waitingTime;
    }
}
