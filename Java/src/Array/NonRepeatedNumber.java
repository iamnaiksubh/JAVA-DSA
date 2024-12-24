package Array;

import java.util.HashMap;
import java.util.Map;

// All elements repeated twice except one element, find the non-repeated element
public class NonRepeatedNumber {

    // TC : O(N) SC : O(1)
    private static int getNonRepeatedNumberApproach1(int[] ar){
        int result = 0;

        for (int element : ar){
            result ^= element;
        }

        return result;
    }

    // TC : O(N) SC : O(N)
    private static int getNonRepeatedNumberApproach2(int[] ar){
        Map<Integer, Integer> map = new HashMap<>();

        for (int element : ar){
            if (map.containsKey(element)){
                map.put(element, map.get(element) + 1);
            }else{
                map.put(element, 1);
            }
        }

        for(Map.Entry<Integer, Integer> mp : map.entrySet()){
            if (mp.getValue() == 1)
                return  mp.getKey();
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] ar = {1,2,1,3,4,5,4,5,2,7,7};
        System.out.println(getNonRepeatedNumberApproach1(ar));
        System.out.println(getNonRepeatedNumberApproach2(ar));
    }
}
