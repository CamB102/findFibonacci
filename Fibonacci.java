package algorithmday1;
import java.util.ArrayList;

public class Fibonacci {

    public static void main(String[] args) {
        int fibIndex = 1;
        int fibValue = findFibonacci(fibIndex);
        System.out.println("Fib(" + fibIndex + ")" + " is " + fibValue);
        System.out.println("O(n)");
    }

    public static int findFibonacci(int i) {
        ArrayList<Integer> fibo = new ArrayList<Integer>();
        fibo.add(1);
        fibo.add(1);
        for (int j = 2; j <= i; j++) {
            fibo.add(fibo.get(j-1) + fibo.get(j-2));
        }
        return fibo.get(i-1);
    }
}
