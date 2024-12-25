package Math;

import java.math.BigInteger;
import java.util.Scanner;

public class PowerOfTwo {

    /****************
    Constraints

    1 <= T <= 10000
    1 <= N <= 10^18
    ******************/

    // TC : O(t*d) {d : number of digits} SC : O(1)
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
            String num = sc.next();
            BigInteger n, m;

            n = new BigInteger(num);
            m = n.subtract(BigInteger.ONE);

            String result = (n.and(m)).equals(BigInteger.ZERO) ? "True" : "False";
            result = (n.equals(BigInteger.ZERO)) ? "False" : result;
            System.out.println(result);
            t--;
        }
    }
}
