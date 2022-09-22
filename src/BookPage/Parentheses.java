package BookPage;

import java.util.Scanner;
import java.util.Stack;

public class Parentheses {
    public static boolean checkingParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch(ch)
            {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.peek()!='(')
                        return false;
                    stack.pop();
                    break;
                case '}':
                    if(stack.peek()!='{')
                        return false;
                    stack.pop();
                    break;
                case ']':
                    if(stack.peek()!='[')
                        return false;
                    stack.pop();
                    break;

            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(checkingParentheses(sc.nextLine()));

    }

}
