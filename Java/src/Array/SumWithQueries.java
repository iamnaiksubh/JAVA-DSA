package Array;

import java.util.Scanner;

public class SumWithQueries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] ar = new int[n];
            long sum = 0;

            for(int i=0; i<n; i++){
                ar[i] = sc.nextInt();
            }

            for(int i=0; i<n; i++){
                sum += ar[i];
            }

            int q = sc.nextInt();

            while(q-- > 0){
                long i = sc.nextInt();
                long j = sc.nextInt();
                long x = sc.nextInt();

                sum = sum + (long)((j-i+1) * x);
            }

            System.out.println(sum);
        }
    }
}
