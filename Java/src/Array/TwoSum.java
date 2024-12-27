package Array;

import java.util.Arrays;

public class TwoSum {

    // TC : O(NlogN + N) SC : O(1)
    private static boolean twoSum(int[] ar, int target){

        Arrays.sort(ar);
        int p1 = 0, p2 = ar.length-1;

        while(p1 < p2){
            if (ar[p1] + ar[p2] == target){
                return true;
            }else if(ar[p1] + ar[p2] > target){
                p2--;
            }else {
                p1++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] ar = {1, 4, 45, 6, 10, 8};
        System.out.println(twoSum(ar, 16));
    }
}
