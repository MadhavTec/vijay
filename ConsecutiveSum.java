package techolution;

import java.util.Scanner;

/**
 * Created by vijay on 10/13/2017.
 */
public class ConsecutiveSum {
    public static void main(String[] args) {
        Integer num = getNumber();
        if(num <1 || num>100){
            System.out.println("please enter the number between 1 and 100");
            num = getNumber();
        }
        int consecutiveCount = 0;
        for (int i = 1; i * (i + 1) < 2 * num; i++)
        {
            float a = (float) ((1.0 * num-(i * (i + 1)) / 2) / (i + 1));
            if (a-(int)a == 0.0)
                consecutiveCount++;
        }
        System.out.println("The given number  no of consecutive is : "+consecutiveCount);
    }
    public static Integer getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number :");
        return sc.nextInt();
    }
}
