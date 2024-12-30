package Array;

import java.util.Scanner;

public class FirstMissingPositiveInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] ar = new int[n];

            for(int i=0; i<n; i++){
                ar[i] = sc.nextInt();
            }

            int size = (int)1e5 + 1;
            int[] cnt = new int[size];

            for(int i=0; i<n; i++){
                if (ar[i] > 0)
                    cnt[ar[i]]++;
            }

            for(int i=1; i<size; i++){
                if (cnt[i] == 0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
