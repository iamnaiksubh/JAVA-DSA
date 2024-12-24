package Basic.BitManipulation;

public class SetBit {

    private static boolean isSetBit(int num, int bit){
        return !((num & (1 << bit)) == 0);
    }

    public static void main(String[] args) {
        System.out.println(isSetBit(5,1));
        System.out.println(isSetBit(6,2));
        System.out.println(isSetBit(10,3));
    }
}
