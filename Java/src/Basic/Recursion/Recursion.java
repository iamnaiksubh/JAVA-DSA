package Basic.Recursion;

public class Recursion {

    private static int sumOfNaturalNumbers(int n){
        if (n == 1)
            return 1;

        return n + sumOfNaturalNumbers(n-1);
    }

    private static int factorial(int n){
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n-1);
    }

    private static int fibonacci(int n){
        if (n == 1 || n == 2)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumbers(6));
        System.out.println(factorial(4));
        System.out.println(fibonacci(7));
    }
}

