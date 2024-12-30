package Stack;

import java.util.Scanner;

public class ImplementTwoStackUsingOneArray {
    private static final int N = 5;
    private static int[] stack = new int[N];
    private static int topOne;
    private static int topTwo;

    private static class StackOne{
        StackOne(){
            topOne = -1;
        }

        public void push(int x) {
            if ((topOne + 1) == topTwo) {
                System.out.println("Stack Overflow");
                return;
            }
            stack[++topOne] = x;
        }

        public int pop() {
            if (topOne == -1)
                return Integer.MIN_VALUE;

            return stack[topOne--];
        }

        public int peek() {
            if (topOne == -1)
                return Integer.MIN_VALUE;
            return stack[topOne];
        }

        public int size() {
            return topOne + 1;
        }
    }

    private static class StackTwo{
        StackTwo(){
            topTwo = N;
        }

        public void push(int x) {
            if (topTwo -1 == topOne){
                System.out.println("Stack Overflow");
                return;
            }
            stack[--topTwo] = x;
        }

        public int pop() {
            if (topTwo == N)
                return Integer.MIN_VALUE;

            return stack[topTwo++];
        }

        public int peek() {
            if (topTwo == N)
                return Integer.MIN_VALUE;
            return stack[topTwo];
        }

        public int size() {
            return N - topTwo;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackOne stackOne = new StackOne();
        StackTwo stackTwo = new StackTwo();

        int t = sc.nextInt();

        while(t-- > 0){
            String query = sc.next();

            switch (query){
                case "push1" :
                    int stackOneElement = sc.nextInt();
                    stackOne.push(stackOneElement);
                    break;

                case "pop1" :
                    int pop1Element = stackOne.pop();
                    if (pop1Element == Integer.MIN_VALUE)
                        System.out.println("Empty");
                    else
                        System.out.println(pop1Element);
                    break;

                case "peek1" :
                    int peek1Element = stackOne.peek();
                    if (peek1Element == Integer.MIN_VALUE)
                        System.out.println("Empty");
                    else
                        System.out.println(peek1Element);
                    break;

                case "size1" :
                    System.out.println(stackOne.size());
                    break;

                case "push2" :
                    int stackTwoElement = sc.nextInt();
                    stackTwo.push(stackTwoElement);
                    break;

                case "pop2" :
                    int pop2Element = stackTwo.pop();
                    if (pop2Element == Integer.MIN_VALUE)
                        System.out.println("Empty");
                    else
                        System.out.println(pop2Element);
                    break;

                case "peek2" :
                    int peek2Element = stackTwo.peek();
                    if (peek2Element == Integer.MIN_VALUE)
                        System.out.println("Empty");
                    else
                        System.out.println(peek2Element);
                    break;
                case "size2" :
                    System.out.println(stackTwo.size());
                    break;

                default:
                    System.out.println("Not a valid operation");
                    break;
            }
        }
    }
}
