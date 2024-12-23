package Basic.Math;

public class Divisor {

    // TC : O(sqrt(N)) SC : O(1)
    private static void numberOfDivisor(int num){
        int i,count = 0;
        for(i=1; i*i < num; i++){
            count += (((num/i) * i) == num ) ? 2 : ((num % i == 0) ? 1 : 0);
        }

        if (i*i == num)
            count++;

        System.out.println("Number of divisor: " + count);
    }

    public static void main(String[] args) {
        numberOfDivisor(65);
    }
}
