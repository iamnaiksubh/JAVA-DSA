package Basic.BitManipulation;

public class CountSetBits {

    // unset the last bit, so checking only set bit times.
    private static int getSetBitsCount(int n){
        int count = 0;

        while (n != 0){
            n = n&(n-1);
            count++;
        }

        return count;
    }

    // checking each bits.
    private static int getCountOfSetBits(int num){
        int count = 0;
        while(num != 0){
            if ((num&1) == 1){
                count++;
            }
            num = num>>1;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(getCountOfSetBits(15));
        System.out.println(getSetBitsCount(15));
        System.out.println(getCountOfSetBits(8));
        System.out.println(getSetBitsCount(8));
        System.out.println(getCountOfSetBits(0));
        System.out.println(getSetBitsCount(0));
    }
}
