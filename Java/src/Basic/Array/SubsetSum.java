package Basic.Array;

public class SubsetSum {

    // TC : O(2^N * N) SC : O(1)
    private static void printSubsetSum(int[] ar){
        int n = ar.length;
        for (int i=0; i<(1<<n); i++){
            int sum = 0;
            for (int j=0; j<n; j++){
                if ((i&(1<<j)) != 0){
                    sum += ar[j];
                }
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        int[] ar = {5, -6, 15};
        printSubsetSum(ar);
    }
}
