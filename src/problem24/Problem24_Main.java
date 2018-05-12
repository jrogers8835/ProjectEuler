package problem24;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Math.floor;
import static java.lang.Math.pow;

public class Problem24_Main {

    public static void main(String[] args){
        List<Integer> input = new LinkedList<Integer>(){{
            for(int i=0;i<10;i++){
                add(i);
            }
        }};
        System.out.println(lexiPerm(input,1000000));
    }

    private static long lexiPerm(List<Integer> input, int permutation) {
        permutation--;
        long result=0;
        for(int i = input.size()-1;i>-1;i--){
            result+=input.remove(permutation/factorial(i))*(int)pow(10,i);
            permutation = permutation % factorial(i);
        }
        return result;
    }

    private static int factorial(int number){
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;
    }
}
