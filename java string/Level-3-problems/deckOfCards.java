import java.util.*;
public class deckOfCards {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
                // Step 1: Initialize the deck
                String[] deck = initializeDeck();
                
                // Step 2: Shuffle the deck
                shuffleDeck(deck);
                
                // Step 3: Take user input for players and cards
                System.out.print("Enter number of players: ");
                int players = sc.nextInt();
                
                System.out.print("Enter number of cards per player: ");
                int cardsPerPlayer = sc.nextInt();
        
                // Step 4: Distribute cards
                String[][] playerCards = distributeCards(deck, players, cardsPerPlayer);
                
                // Step 5: Print players' cards
                printPlayerCards(playerCards);
        
                sc.close();
            }
        
            // Method to initialize deck
            public static String[] initializeDeck() {
                String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
                String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        
                int numOfCards = suits.length * ranks.length;
                String[] deck = new String[numOfCards];
        
                int index = 0;
                for (String suit : suits) {
                    for (String rank : ranks) {
                        deck[index++] = rank + " of " + suit;
                    }
                }
                return deck;
            }
        
            // Method to shuffle deck
            public static void shuffleDeck(String[] deck) {
                int n = deck.length;
                for (int i = 0; i < n; i++) {
                    int randomCardNumber = i + (int) (Math.random() * (n - i));
                    String temp = deck[i];
                    deck[i] = deck[randomCardNumber];
                    deck[randomCardNumber] = temp;
                }
            }
        
            // Method to distribute cards
            public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
                int totalCards = players * cardsPerPlayer;
                if (totalCards > deck.length) {
                    System.out.println("Not enough cards to distribute!");
                    return new String[0][0]; // Return empty 2D array
                }
        
                String[][] playerCards = new String[players][cardsPerPlayer];
                int index = 0;
        
                for (int i = 0; i < players; i++) {
                    for (int j = 0; j < cardsPerPlayer; j++) {
                        playerCards[i][j] = deck[index++];
                    }
                }
                return playerCards;
            }
        
            // Method to print players and their cards
            public static void printPlayerCards(String[][] playerCards) {
                System.out.println("\nPlayer Cards:");
                
        
                for (int i = 0; i < playerCards.length; i++) {
                    System.out.print("Player " + (i + 1) + ": ");
                    for (int j = 0; j < playerCards[i].length; j++) {
                        System.out.print(playerCards[i][j] + " | ");
                    }
                    System.out.println();
                }
            }
        }
        