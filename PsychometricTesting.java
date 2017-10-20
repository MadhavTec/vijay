package techolution;

import java.util.Arrays;

/**
 * Created by vijay on 10/15/2017.
 */
public class PsychometricTesting {
    public static void main(String[] args) {
        int a[] = {4,8,7};
        Arrays.sort(a);
        int lowerLimits[] = {2,4};
        int upperLimits[] = {8,4};
        int results[] = jobOffers(a,lowerLimits,upperLimits);
        for(int result:results){
            System.out.println(result);
        }
    }
    static int[] jobOffers(int scores[],int lowerLimits[],int upperLimits[]){
        // i hope both lowerLimits and upperLimits array length are same
        int result[]  = new int[lowerLimits.length];
        for(int i=0;i<lowerLimits.length;i++){
            result[i] = getBetweenScoreLength(scores,lowerLimits[i],upperLimits[i]);
        }
        return result;
    }
    public static int getBetweenScoreLength(int sortedScores[],int lowerScore,int upperScore){
        int result = 0;
        for(int i = 0;i<sortedScores.length;i++){
            if(sortedScores[i]>upperScore){
                break;
            }
            if(lowerScore <= sortedScores[i] && upperScore >= sortedScores[i]){
                result++;
            }
        }
        return result;
    }
}
