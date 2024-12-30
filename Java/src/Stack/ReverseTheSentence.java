package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseTheSentence {

    private static String reverseSentence(String str){
        Stack<String> stack = new Stack<>();

        String[] s = str.split(" ");

        for(String word : s){
            stack.push(word);
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()){
            result.append(stack.pop());
            result.append(" ");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            String str = sc.nextLine();
            System.out.println(reverseSentence(str));
        }
    }
}
