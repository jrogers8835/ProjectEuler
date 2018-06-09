package problem014;

public class Problem014_Main {
    public static void main(String[] args) {
        int longestSeq = 1;
        Long longestSeqI = 0L;
        int current;
        for(Long i = 1L; i<1_000_000L;i++){
            current = collatzSeq(i);
            System.out.println(i+":"+current);
            longestSeq = current>longestSeq? current : longestSeq;
            longestSeqI = current==longestSeq? i : longestSeqI;
        }
        System.out.println("Longest: "+longestSeqI);
    }
    
    private static int collatzSeq(Long number){
        int counter =1;
        while(number!=1){
            number=number % 2 != 0?3*number+1:number/2;
            counter++;
        }
        return counter;
    }
}
