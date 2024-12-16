package Basic.Array;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int size = arr.length;

        for(int i=0; i<size; i++) {
            System.out.print(arr[i] + " ");
        }

        // It's a shallow copy, but it acts like a deep copy for primitive datatype.
        int[] cloneArr = arr.clone();
        System.out.println(cloneArr == arr);

        arr[0] = 10;

        // Memory location is diff, but the values are copy of first array (Shallow copy, but for primitive datatype it act like deep copy)
        for(int element : arr)
            System.out.print(element + " ");
        for(int element : cloneArr)
            System.out.print(element + " ");


        // asList
        System.out.println(Arrays.asList(1,2,3,4));

        // sort
        Arrays.sort(arr);
        for(int element : arr){
            System.out.print(element + " ");
        }

        // binary search
        System.out.println("\nElement index : " + Arrays.binarySearch(arr, 10));

        // parallel sort (Similar to TimSort)
        // Divide and Conquer
        cloneArr[0] = 23;
        cloneArr[3] = 12;
        cloneArr[4] = 72;
        Arrays.parallelSort(cloneArr);
        System.out.print("\n Parallel sort : ");

    }

}
