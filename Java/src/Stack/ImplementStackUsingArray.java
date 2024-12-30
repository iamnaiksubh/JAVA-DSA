package Stack;

import java.util.Scanner;

public class ImplementStackUsingArray {

    static class Stack {

        int[] stack;
        int top;

        public Stack(){
            top = -1;
            stack = new int[1000];
        }

        public void push(int x) {
            stack[++top] = x;
        }

        public int pop() {
            if (top < 0)
                return Integer.MIN_VALUE;

            return stack[top--];
        }

        public int peek() {
            if (top < 0)
                return Integer.MIN_VALUE;
            return stack[top];
        }

        public int size() {
            return top + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();

        int t = sc.nextInt();

        while(t-- > 0){
            String query = sc.next();

            switch (query){
                case "push" :
                    int element = sc.nextInt();
                    stack.push(element);
                    break;

                case "pop" :
                    int popElement = stack.pop();
                    if (popElement == Integer.MIN_VALUE)
                        System.out.println("Empty");
                    else
                        System.out.println(popElement);
                    break;

                case "peek" :
                    int peekElement = stack.peek();
                    if (peekElement == Integer.MIN_VALUE)
                        System.out.println("Empty");
                    else
                        System.out.println(peekElement);
                    break;
                case "size" :
                    System.out.println(stack.size());
                    break;

                default:
                    System.out.println("Not a valid operation");
                    break;
            }
        }
    }
}
