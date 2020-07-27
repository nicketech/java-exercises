import java.util.Arrays;

public class PokerHands {
    public static void main(String[] args) {

        String[] cards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Input to integer
        int n = Integer.parseInt(args[0]);

        // Iteration n (input) times
        int i = 0;
        while (i < n) {

            //Array of cards to print
            int size = 5;
            String[] hand = new String[size];

            // Random cards for a hand
            for (int j = 0; j < size; j++) {


                // Random int for the index of the pick
                int cardsLen = cards.length;
                int a = (int) (Math.random() * cardsLen);

                hand[j] = cards[a];
            }
            i++;

            System.out.println(Arrays.toString(hand));
        }
    }
}