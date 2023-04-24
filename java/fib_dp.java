import java.util.*;

public class fib_dp {
    public static void main(String[] args) {
        System.out.println(fib(50));
    }
    static long[] dp = new long[53];
    static long fib(int n){
        if (n <= 1)
            return n;
        else{
            if (dp[n] != 0){
                return dp[n];
            }
            else {
                return dp[n] = fib(n - 1) + fib(n - 2);
            }
        }
    }
}
