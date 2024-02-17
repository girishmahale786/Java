public class Card {
    private String rank;
    private String suit;

    // Constructor to initialize card with rank and suit
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Setter method to set the rank of the card
    public void setRank(String rank) {
        this.rank = rank;
    }

    // Getter method to get the rank of the card
    public String getRank() {
        return rank;
    }

    // Setter method to set the suit of the card
    public void setSuit(String suit) {
        this.suit = suit;
    }

    // Getter method to get the suit of the card
    public String getSuit() {
        return suit;
    }

    // toString method to represent the card as a string
    public String toString() {
        return rank + " of " + suit;
    }
}
