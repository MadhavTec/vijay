package techolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by vijay on 10/13/2017.
 */
public class BalancedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the no of expression , do you want check");
        int no = sc.nextInt();
        System.out.println("Please enter the " + no + " expressions");
        String expArr[] = new String[no];
        for (int i = 0; i < no; i++) {
            expArr[i] = sc.next();
        }
        int maxRepArr[] = new int[no];
        System.out.println("Please enter the " + no + " maxReplacement integer respectively");
        for (int j = 0; j < no; j++) {
            maxRepArr[j] = sc.nextInt();
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < no; i++) {
            String expression = expArr[i];
            int balanced = isBalanced(expression);
            if (balanced == 1)
                result.add(balanced);
            else {
                int mxReplacement = maxRepArr[i];
                expression = replacement(expression,mxReplacement);
                result.add(isBalanced(expression));
            }
        }
        System.out.println("Result is :"+result);
    }

    public static int isBalanced(String expression) {
        int balanced = 0;
        Stack<Character> stack = new Stack<>();
        for (char chr : expression.toCharArray()) {
            if (chr == '<') {
                stack.push(chr);
            } else {
                if (stack.isEmpty())
                    balanced = 0;
                else {
                    if (stack.pop() == '<')
                        balanced = 1;
                }
            }
            if (!stack.isEmpty()) {
                balanced = 0;
            }
        }
        return balanced;
    }

    public static String replacement(String expression,int maxReplacement) {
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        int replacement = 0;
        for (char chr : expression.toCharArray()) {
            if (chr == '<') {
                stack.push(chr);
                sb.append("<");
            }
            else {
                if(replacement < maxReplacement){
                    if (stack.isEmpty()) {
                        sb.append("<>");
                        replacement++;
                    }
                    else if(stack.pop() != '<'){
                        sb.append("<>");
                        replacement++;
                    }
                    else
                        sb.append(chr);
                }
                else
                    sb.append(chr);

            }
        }
        return sb.toString();
    }
}

