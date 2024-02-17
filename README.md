# Assignment 4: Cards and Deck Operations

This Java program, allows users to perform various actions related to a standard deck of playing cards. The program includes options to display the entire deck, find cards of the same suit, compare cards with the same rank, find a particular card, deal random cards, shuffle the deck.

## `Main.java` Methods

### `main(String[] args)`
- **Description:** Initiates the program execution. Takes user inputs and performs operations on deck of cards.
- **Parameters:**
  - `args`: Command-line arguments (not used in this program).
- **Execution Steps:**
  1. Creates an instance of `UserInput` and `Deck` class to handle user input and cards operations respectively.
  2. Displays a menu with options for cards operations in a loop.
  3. Reads user choice and performs selected operation on deck of cards using a switch statement.
  4. Continues the loop until the user chooses to exit the program.


## `Card.java` Methods

### Constructors
- **`Card(String rank, String suit)`:** Initializes a card with the given rank and suit.

### Getter and Setter Methods
- **`setRank(String rank)`:** Sets the rank of the card.
- **`getRank()`:** Gets the rank of the card.
- **`setSuit(String suit)`:** Sets the suit of the card.
- **`getSuit()`:** Gets the suit of the card.

### `toString()`
- **Description:** Converts a card object to a string representation.
- **Parameters:** `None`
- **Returns:** A string containing the rank and suit of the card.


## `Deck.java` Methods

### Constructors
- **`Deck()`:** Initializes the deck with 52 cards, representing each combination of rank and suit.

### Getter and Setter Methods
- **`setCards(ArrayList<Card> cards)`:** Sets the list of cards in the deck.
- **`getCards()`:** Gets the list of cards in the deck.
- **`getRanks()`:** Gets the possible ranks of cards.
- **`getSuits()`:** Gets the possible suits of cards.

### `toString()`
- **Description:** Converts a deck object to a string representation.
- **Parameters:** `None`
- **Returns:** A string containing all the cards in the deck.

### `shuffleDeck()`
- **Description:** Shuffles the deck by randomly rearranging the order of cards.
- **Parameters:** `None`
- **Returns:** `None`

### `sameCard(String suit)`
- **Description:** Finds and returns cards of the same suit as provided.
- **Parameters:**
  - `suit`: The suit of the cards to be searched for.
- **Returns:** A list of cards of the same suit as provided.

### `compareCard(String rank)`
- **Description:** Finds and returns cards with the same rank as provided.
- **Parameters:**
  - `rank`: The rank of the cards to be searched for.
- **Returns:** A list of cards with the same rank as provided.

### `findCard(String rank, String suit)`
- **Description:** Finds and returns a particular card with the given rank and suit.
- **Parameters:**
  - `rank`: The rank of the card to be searched for.
  - `suit`: The suit of the card to be searched for.
- **Returns:** A card object with the given rank and suit, null otherwise.

### `dealCard(int numCards)`
- **Description:** Deals and returns a given number of cards from the deck.
- **Parameters:**
  - `numCards`: The number of cards to be dealt.
- **Returns:** A list of cards dealt from the deck.


## `UserInput.java` Methods

### `getScanner()`
- **Description:** Gets the Scanner object for reading input.
- **Parameters:** `None`
- **Returns:** A new Scanner object for reading input from the console.

### `getIntInput(String message)`
- **Description:** Gets an integer input from the user with a prompt message.
- **Parameters:**
  - `message`: The prompt message to display to the user.
- **Returns:** The integer input from the user.

### `getStringInput(String message)`
- **Description:** Gets a string input from the user with a prompt message.
- **Parameters:**
  - `message`: The prompt message to display to the user.
- **Returns:** The string input from the user.

### `getChoiceInput(String[] choices, String choice)`
- **Description:** Gets a user's choice input from a list of choices.
- **Parameters:**
  - `choices`: An array of possible choices.
  - `choice`: The type of choice (e.g., "suit" or "rank").
- **Returns:** The user's selected choice.
