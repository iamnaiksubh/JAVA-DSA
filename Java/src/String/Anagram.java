package String;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    // TC : O(N) SC : O(N)
    private static boolean checkAnagram(String s1, String s2){
        if (s1.length() != s2.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s1.length(); i++){
            if (map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
            }else{
                map.put(s1.charAt(i), 1);
            }

            if (map.containsKey(s2.charAt(i))){
                map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
            }else{
                map.put(s2.charAt(i), -1);
            }
        }

        for(Map.Entry<Character, Integer> mp : map.entrySet()){
            if (mp.getValue() != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkAnagram("geeks", "kseeg"));
        System.out.println(checkAnagram("allergy", "allergic"));
        System.out.println(checkAnagram("g", "g"));
    }
}
