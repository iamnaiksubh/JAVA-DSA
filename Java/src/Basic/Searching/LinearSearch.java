package Basic.Searching;

public class LinearSearch {

    // TC : O(N) SC : O(1)
    private static boolean linearSearch(int[] ar, int k){
        for(int element : ar){
            if (element == k)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] ar = {1,24,3,2,53,13,5,22,7};
        System.out.println(linearSearch(ar, 53));
        System.out.println(linearSearch(ar, 0));
        System.out.println(linearSearch(ar, 5));
    }
}
