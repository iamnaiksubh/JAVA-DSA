package Basic.String;

// Check if string A is a rotation of string B
public class TwoStringRotation {

    private static boolean checkTwoStrings(String a, String b){
        if (a.length() != b.length())
            return false;

        int size = a.length();
        boolean match = false;

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                match = a.charAt(j) == b.charAt((i + j) % size);
                if (!match) break;
            }
            if (match) break;
        }

        return match;
    }

    public static void main(String[] args) {
        System.out.println(checkTwoStrings("rotation", "tionrota"));
        System.out.println(checkTwoStrings("example", "pleexam"));
        System.out.println(checkTwoStrings("example", "exam"));
        System.out.println(checkTwoStrings("match", "match"));
        System.out.println(checkTwoStrings("match", "hmtac"));
    }
}
