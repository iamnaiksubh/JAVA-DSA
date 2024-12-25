package Math;

import java.util.Scanner;

public class APowerB {

    // TC : O(t * log(b)) SC : O(1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long result =  1;
            long mod = (long) 1e9 + 7;
            while(b != 0){
                if ((b & 1) == 1){
                    result = (result * a) % mod;
                }
                a = (a*a)%mod;
                b = b >> 1;
            }

            System.out.println(result);

            t--;
        }
    }
}
