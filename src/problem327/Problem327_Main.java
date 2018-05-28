package problem327;

public class Problem327_Main {
    public static void main(String[] args) {
        System.out.println(sumOfMinCards(3,1));
    }

    private static int sumOfMinCards(int maxCards, int numOfRooms){
        int minCardsNeeded;
        switch (numOfRooms){
            case 3:
                minCardsNeeded=5;
            case 2:
                minCardsNeeded=3;
            case 1:
                minCardsNeeded=2;
                break;
            default:
                minCardsNeeded=0;
                break;
        }
        return minCardsNeeded;
    }
}
