/**
* @author  Girish Mahale
* @branch  AIML B3
* @batch   2022-26
* @prn     23070126504
*/

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        UserInput userInput = new UserInput();

        // Create a new deck of cards
        Deck deck = new Deck();

        while(true) {
            // Display the menu options to the user
            System.out.println("Menu:");
            System.out.println("1. Display the entire deck");
            System.out.println("2. Find cards of the same suit");
            System.out.println("3. Compare cards with the same rank");
            System.out.println("4. Find a particular card");
            System.out.println("5. Deal random cards");
            System.out.println("6. Shuffle the deck");
            System.out.println("7. Exit");

            int choice = userInput.getIntInput("Enter your choice: ");

            // Perform actions based on the user's choice
            switch (choice) {
                case 1:
                    System.out.println("Entire Deck:");
                    System.out.println(deck);
                    break;
                case 2:
                    String suit = userInput.getChoiceInput(deck.getSuits(), "suit");
                    // Display cards with the same suit
                    System.out.println(deck.sameCard(suit));
                    break;
                case 3:
                    String rank = userInput.getChoiceInput(deck.getRanks(), "rank");
                    // Display cards with the same rank
                    System.out.println(deck.compareCard(rank));
                    break;
                case 4:
                    String cardSuit = userInput.getChoiceInput(deck.getSuits(), "suit");
                    String cardRank = userInput.getChoiceInput(deck.getRanks(), "rank");
                    // Find the card
                    Card foundCard = deck.findCard(cardRank, cardSuit);
                    if (foundCard != null) {
                        System.out.println("Card found: " + foundCard);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case 5:
                    int numCards = userInput.getIntInput("Enter number of cards to deal: ");
                    while(true) {
                        // Check if the user entered a valid number of cards
                        if (numCards <= deck.getCards().size()) {
                            break;
                        }
                        System.out.println("Deck has only " + deck.getCards().size() + " cards. Please try again.");
                    }
                    // Deal given number of random cards
                    System.out.println("Dealt cards: " + deck.dealCard(numCards));
                    break;
                case 6:
                    // Shuffle the deck
                    deck.shuffleDeck();
                    System.out.println("Deck shuffled.");
                    break;
                case 7:
                    // Exit the program
                    System.out.println("Program Exited!");
                    System.exit(0);
                default:
                    // Handle invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
