package problem006;

import java.util.stream.IntStream;

public class Problem006_Main {
    public static void main(String[] args) {
        System.out.println(sumSquareDifference(100));
    }

    private static long sumSquareDifference(int max){
        long result=(long)Math.pow(IntStream.range(1,max+1).sum(),2);
        for(int i=1;i<max+1;i++){
            result-=(long)Math.pow(i,2);
        }
        return result;
    }
}
