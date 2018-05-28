package problem003;

import java.util.ArrayList;
import java.util.List;

public class Problem03_Main {
    static List<Long> primes = new ArrayList<>();
    static Long lastChecked = 1L;
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(600_851_475_143L ));
    }

    private static long largestPrimeFactor(long number){
        long largestPrime = 1;
        while(number!=1){
            for(int i=2;i<=number;i++){
                if(isPrime(i)){
                    if(number%i==0){
                        largestPrime = i;
                        number=number/i;
                    }
                }
            }
        }
        return largestPrime;
    }

    private static boolean isPrime(long value){
        if(primes.contains(value)){
            return true;
        }
        if(value<lastChecked){
            return false;
        }
        boolean isPrime = true;
        for(Long prime: primes){
            if(value%prime==0)isPrime=false;
        }
        if(isPrime){
            primes.add(value);
        }
        return isPrime;
    }
}
