package problem004;

public class Problem004_Main {
    public static void main(String[] args) {
        System.out.println(largestPalindromeByProduct(3));
    }

    private static int largestPalindromeByProduct(int numberOfDigits){
        int largestPalindrome=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<numberOfDigits;i++){
            sb.append(9);
        }
        int maxFactor = Integer.parseInt(sb.toString());
        int minFactor = 10^(numberOfDigits-1);
        boolean isPalindrome;
        int i=Integer.parseInt(sb.toString()),
            j=maxFactor;
        while(i>minFactor){
            while(j>minFactor) {
                isPalindrome=isPalindromicNumber(i*j);
                if(isPalindrome && i*j>largestPalindrome){
                    largestPalindrome=i*j;
                }
                j--;
            }
            j=maxFactor;
            i--;
        }
        return largestPalindrome;
    }

    private static boolean isPalindromicNumber(int number){
        boolean isPalindromic =true;
        char[] numberAsString=(number+"").toCharArray();
        int left=0;
        int right = numberAsString.length-1;
        while(isPalindromic && left!=right && right-left>0){
            isPalindromic=numberAsString[left]==numberAsString[right];
            left++;
            right--;
        }
        return isPalindromic;
    }
}
