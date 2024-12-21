package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharacter {

    private static char getFirstNonRepeatingCharacter(String s){
        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }

        for(Map.Entry<Character, Integer> mp : map.entrySet()){
            if (mp.getValue() == 1)
                return mp.getKey();
        }

        return '$';
    }

    public static void main(String[] args) {
        System.out.println(getFirstNonRepeatingCharacter("geeksforgeeks"));
        System.out.println(getFirstNonRepeatingCharacter("racecar"));
        System.out.println(getFirstNonRepeatingCharacter("aabbccc"));
    }
}
