package Array;

public class MoveAllZeroesToEnd {

    private static void swap(int[] ar, int i, int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    // TC : O(N) SC : O(1)
    private static void pushZeroesToEnd(int[] ar){
        int count = 0;

        for(int i=0; i<ar.length; i++){
            if(ar[i] != 0){
                swap(ar, i, count);
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int[] ar = { 0,0,3,0,5,6,7,0};
        pushZeroesToEnd(ar);

        for(int element : ar){
            System.out.print(element + " ");
        }
    }
}
