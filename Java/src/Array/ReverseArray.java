package Array;

public class ReverseArray {
    private static void swap(int[] ar, int i, int j){
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    // TC : O(N) SC : O(1)
    private static void reverseArray(int[] arr){
        int p1 = 0, p2 = arr.length - 1;

        while(p1 < p2){
            swap(arr, p1, p2);
            p1++;
            p2--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,56,73,3,24};
        reverseArray(arr);

        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}
