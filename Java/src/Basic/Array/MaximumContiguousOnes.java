package Basic.Array;

public class MaximumContiguousOnes {

    // TC : O(N) SC : O(1)
    private static int getMaximumContiguousOnes(int arr[]){
        int count = 0, maxCount = 0;

        for (int j : arr) {
            if (j == 1) {
                count++;
            }

            if (j == 0) {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }

        maxCount = Math.max(maxCount, count);

        return maxCount;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1,1,0,1,1,0,0,0,1,1,1,1,1,1,1,1};

        System.out.print("Maximum Contiguous Ones : " + getMaximumContiguousOnes(arr));
    }
}
