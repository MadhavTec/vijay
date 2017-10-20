package techolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by vijay on 10/14/2017.
 */
public class FindTheWinner {
    static int size = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the Array");
        size = sc.nextInt();
        int andrea[] = new int[size];
        int maria[] = new int[size];
        System.out.println("please denote "+size+" values for Andrea's Array");
        for(int i =0;i<size;i++){
            andrea[i] = sc.nextInt();
        }
        System.out.println("please denote "+size+" values for Maria's Array");
        for(int i=0;i<size;i++){
            maria[i] = sc.nextInt();
        }
        System.out.println("Please enter the game type Odd or Even");
        String cameType = sc.next();
        System.out.println(winner(andrea,maria,cameType));
    }
    public static String winner(int[] andrea, int[] maria,String s){
        int andreaScore = 0;
        int mariaScore = 0;
        String result = null;
        List<Integer> moves =  new ArrayList<>();
        if("Odd".equalsIgnoreCase(s)){
            for(int i = 1;i<size;i=i+2 ){
                moves.add(i);
            }
        }
        else if("Even".equalsIgnoreCase(s)){
            for(int i = 0;i<size;i=i+2 ){
                moves.add(i);
            }
        }
        for(int move : moves){
            andreaScore += andrea[move]-maria[move];
            mariaScore += maria[move]-andrea[move];
        }
        if(andreaScore > mariaScore)
            result = "Andrea";
        else if(mariaScore > andreaScore)
            result = "Maria";
        else
            result = "Tie";
        return result;

    }
}