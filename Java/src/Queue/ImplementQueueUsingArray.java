package Queue;

import java.util.Scanner;

public class ImplementQueueUsingArray {
    static class Queue {
        int[] queue;
        int front, rear;

        Queue(){
            queue = new int[1000];
            front = rear = -1;
        }

        public void enqueue(int x){
            queue[++rear] = x;
        }

        public int dequeue(){
            if (empty())
                return Integer.MIN_VALUE;

            return queue[++front];
        }

        public int size(){
            return rear - front;
        }

        public boolean empty(){
            return rear == front;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();

        int t = sc.nextInt();

        while(t-- > 0){
            String query = sc.next();

            switch (query){
                case "Enqueue" :
                    int element = sc.nextInt();
                    queue.enqueue(element);
                    break;

                case "Dequeue" :
                    int dequeueElement = queue.dequeue();
                    if (dequeueElement == Integer.MIN_VALUE)
                        System.out.println("Empty");
                    else
                        System.out.println(dequeueElement);
                    break;

                case "Size" :
                    System.out.println(queue.size());
                    break;

                case  "IsEmpty" :
                    System.out.println(queue.empty());
                    break;

                default:
                    System.out.println("Not a valid operation");
                    break;
            }
        }
    }
}
