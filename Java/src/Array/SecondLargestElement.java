package Array;

public class SecondLargestElement {

    // TC : O(N) SC : O(1)
    static int getSecondLargestElement(int[] ar){
        int largestElement = Integer.MIN_VALUE;
        int secondLargestElement = Integer.MIN_VALUE;

        for(int element : ar){
            if(element > largestElement){
                secondLargestElement = largestElement;
                largestElement = element;
            }else if(element != largestElement && secondLargestElement < element){
                secondLargestElement = element;
            }
        }

        return (secondLargestElement == Integer.MIN_VALUE ? -1 : secondLargestElement);
    }


    public static void main(String[] args) {
        int[] ar = {12, 12, 13, 29, 16, 18};

        System.out.print("Second Largest Element in Array : " + getSecondLargestElement(ar));
    }
}
