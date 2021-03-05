

public class SixQuiPrend {

    private static final int NB_CARD_MAX = 104;

    public static int findNumberOfBullHeads(int value) {
        int headBull=0;

       if(value == 55){
           headBull = 7;
       } else if (value % 11 == 0){
           headBull = 5;
       } else if (value % 10 == 0){
           headBull = 3;
       } else if (value % 5 == 0){
           headBull = 2;
       } else {
           headBull = 1;
       }
        return headBull;
    }

    public static void gameLoop() {
        for (int cardValue = 1 ; cardValue <= NB_CARD_MAX ; cardValue++) {
            System.out.println(cardValue + " -> " + findNumberOfBullHeads(cardValue));
        }
    }
}
