package problem012;

public class Problem012_Main {
    public static void main(String[] args) {
        long i=1, triangle=1;
        boolean go = true;
        long value;
        while(go){
            triangle = triangleValue(i);
            value = factorCount(triangle);
            go = value <500l;
            i++;
        }
        System.out.println(triangle);
    }
    
    private static long triangleValue(long x){
        long triangleValue=0;
        for(long i=x; i>0; i--){
            triangleValue+=i;
        }
        return triangleValue;
    }
    
    private static int factorCount(long x){
        int factorCount = 0;
        double stop = Math.sqrt(x);
        for(int i=1; i<stop;i++){
            factorCount+=x%i==0?2:0;
        }
        factorCount+=x%stop==0?1:0;
        return factorCount;
    }
}
