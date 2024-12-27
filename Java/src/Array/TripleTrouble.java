package Array;

import java.util.Scanner;

// Every element occurs three times, except one element,
public class TripleTrouble {

    // TC : O(N) SC : (1)
    private static void printNonRepeatedElement(int[] ar, int n){
        int result = 0;
        for(int i=0; i<31; i++){
            int setBitCount = 0;

            for(int j=0; j<n; j++){
                if ((ar[j]&(1 << i)) != 0){
                    setBitCount++;
                }
            }

            if (setBitCount % 3 != 0)
                result = result | (1 << i);
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
            int n = sc.nextInt();
            int[] ar = new int[n];

            for(int i=0; i<n; i++){
                ar[i] = sc.nextInt();
            }

            printNonRepeatedElement(ar, n);
            t--;
        }
    }
}
