package Array;


public class RotateArray {

    // TC : O(d*N) SC : O(1)
    static void rotateArrayApproach1(int[] arr, int d){
        int rotateBy = d % arr.length;

        if (rotateBy == 0)
            return;


        for(int i=0; i<rotateBy; i++){
            int firstElement = arr[0];

            for(int j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }

            arr[arr.length - 1] = firstElement;
        }

    }

    static void reverse(int[] arr, int p1, int p2){
        while(p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
    }

    // TC : O(N) SC : O(1)
    static void rotateArrayApproach2(int[] arr, int d){
        int rotateBy = d % arr.length - 1;
        reverse(arr, 0, rotateBy);
        reverse(arr, rotateBy + 1, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        rotateArrayApproach2(arr, 14);

        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}
