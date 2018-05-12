package problem7;

import java.util.ArrayList;
import java.util.List;

public class Problem07_Main {
    public static void main(String[] args){
        System.out.println(getPrime(10_001));
    }

    private static int getPrime(int index){
        index--;
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        int i =3;
        boolean isPrime;
        while(primes.size()<=index){
            isPrime=true;
            for(int p=0;p<primes.size();p++){
                if(i%primes.get(p)==0){
                    p=primes.size();
                    isPrime=false;
                }
            }
            if(isPrime){primes.add(i);}
            i++;
        }
        System.out.println(primes);
        return primes.get(index);
    }
}
