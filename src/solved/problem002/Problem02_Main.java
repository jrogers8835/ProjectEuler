package problem002;

import java.util.ArrayList;
import java.util.List;

public class Problem02_Main {
    public static void main(String[] args) {
        System.out.println(sumOfEvenFib(4_000_000));
    }
    private static int sumOfEvenFib(int maxVal){
        List<Integer> fibGen = new ArrayList<Integer>(){{
            add(0);
            add(1);
        }};
        int flipFlop = 0,
            sum =0;
        while(fibGen.get(flipFlop)<maxVal){
            fibGen.set(flipFlop,fibGen.get(0)+fibGen.get(1));
            if(fibGen.get(flipFlop)%2==0){
                sum+=fibGen.get(flipFlop);
            }
            flipFlop=flipFlop==0?1:0;
        }
        return sum;
    }
}

