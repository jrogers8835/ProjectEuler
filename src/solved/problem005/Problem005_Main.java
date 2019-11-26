package problem005;

public class Problem005_Main {
    public static void main(String[] args) {
        // TODO: convert manual to Programmatic
        // 20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1
        // any number divisible by _20_ is divisible by 4 and 5 as well as 2 and 10
        // _19_ is prime and not accounted for yet
        // any number divisible by _18_ is divisible by 9 and 2 as well as 6 and 3
        // _17_ is prime and not accounted for yet
        // 16 is accounted for by the 4 in 20 squared
        // 15 is accounted for by the 5 in 20 and the 3 in 18
        // any number divisible by _14_ is divisible by 7 and 2
        // _13_ is prime and not accounted for yet
        // 12 is accounted for by the 6 in 18 and the 2 18 or 3 and 4 in 20 and 18
        // _11_ is prime and not accounted for yet
        // 10 is accounted for by the 5 and 2 in 20
        // 9 is accounted for in the 18
        // 8 is accounted for by the 2 and 4 in 20
        // 7 is accounted for in the 14
        // 6 is accounted for in the 18
        // 5 is accounted for in the 20
        // 4 is accounted for in the 20
        // 3 is accounted for in the 18
        // 2 is accounted for in the 20
        // 1 is self redundant
        // removing the ones that are redundant leaves:
        // 20,19,18,17,14,13,11
        // multiply these together and you get
        System.out.println(20*19*18*17*14*13*11);
    }
}
