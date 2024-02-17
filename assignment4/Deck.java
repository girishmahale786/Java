import java.util.*;

public class Deck {
    // Define the deck of cards
    private ArrayList<Card> cards;

    // Define possible values and suits for cards
    String[] ranks = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
    String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

    // Constructor to initialize the deck with 52 cards
    public Deck() {
        this.cards = new ArrayList<Card>();
        for (String suit : suits) {
			for (String rank : ranks) {
				Card card = new Card(rank, suit);
				cards.add(card);
			}
		}
    }

    // Setter method to set the cards
    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    // Getter method to get the cards
    public ArrayList<Card> getCards() {
        return cards;
    }

    // Getter method to get the ranks
    public String[] getRanks() {
        return ranks;
    }

    // Getter method to get the suits
    public String[] getSuits() {
        return suits;
    }

    // Method to get a string representation of the deck
    public String toString() {
		return cards.toString();
	}

    // Method to shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    // Method to find cards of the same suit as provided
    public ArrayList<Card> sameCard(String suit) {
        ArrayList<Card> sameSuitCards = new ArrayList<>();
        for (Card card : cards) {
            if (card.getSuit().equals(suit)) {
                sameSuitCards.add(card);
            }
        }
        return sameSuitCards;
    }

    // Method to compare cards having the same rank as provided
    public ArrayList<Card> compareCard(String rank) {
        ArrayList<Card> sameRankCards = new ArrayList<>();
        for (Card card : cards) {
            if (card.getRank().equals(rank)) {
                sameRankCards.add(card);
            }
        }
        return sameRankCards;
    }

    // Method to search for a particular card with given rank and suit
    public Card findCard(String rank, String suit) {
        for (Card card : cards) {
            if (card.getRank().equals(rank) && card.getSuit().equals(suit)) {
                return card;
            }
        }
        return null;
    }

    // Method to deal given number of random cards from the deck
    public ArrayList<Card> dealCard(int numCards) {
        ArrayList<Card> dealtCards = new ArrayList<>();
        shuffleDeck();
        for (int i = 0; i < numCards; i++) {
            dealtCards.add(cards.remove(i));
        }
        return dealtCards;
    }
}
