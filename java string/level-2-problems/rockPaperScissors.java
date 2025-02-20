import java.util.*;

public class rockPaperScissors {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
            
                // Take user input for the number of games
                System.out.println("Enter the number of rounds to play:");
                int rounds = sc.nextInt();
                sc.nextLine(); // Consume newline
        
                int userWins = 0, computerWins = 0, draws = 0;
                String[][] results = new String[rounds][3]; // Stores results for each round
        
                for (int i = 0; i < rounds; i++) {
                    // Get user choice
                    System.out.println("\nEnter your choice (Rock, Paper, Scissors): ");
                    String userChoice = sc.nextLine().toLowerCase();
        
                    // Validate user input
                    if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                        System.out.println("Invalid input! Please enter Rock, Paper, or Scissors.");
                        i--; // Repeat this round
                        continue;
                    }
        
                    // Get computer choice
                    String computerChoice = getComputerChoice();
        
                    // Determine winner
                    String winner = getWinner(userChoice, computerChoice);
        
                    // Update scores
                    if (winner.equals("User")) userWins++;
                    else if (winner.equals("Computer")) computerWins++;
                    else draws++;
        
                    // Store results
                    results[i][0] = userChoice;
                    results[i][1] = computerChoice;
                    results[i][2] = winner;
                }
        
                // Display results table
                displayResultsTable(results);
        
                // Calculate and display final stats
                displayFinalStats(userWins, computerWins, draws, rounds);
        
                sc.close();
            }
        
            // Method to get a random choice for the computer
            public static String getComputerChoice() {
                Random rand = new Random();
                int choice = rand.nextInt(3); // 0, 1, or 2
                return choice == 0 ? "rock" : choice == 1 ? "paper" : "scissors";
            }
        
            // Method to determine the winner
            public static String getWinner(String user, String computer) {
                if (user.equals(computer)) return "Draw";
                if ((user.equals("rock") && computer.equals("scissors")) ||
                    (user.equals("scissors") && computer.equals("paper")) ||
                    (user.equals("paper") && computer.equals("rock"))) {
                    return "User";
                }
                return "Computer";
            }
        
            // Method to display game results in tabular format
            public static void displayResultsTable(String[][] results) {
                System.out.println("\nGame Results:");
                System.out.printf("%-10s %-10s %-10s\n", "User", "Computer", "Winner");
              
        
                for (String[] row : results) {
                    System.out.printf("%-10s %-10s %-10s\n", row[0], row[1], row[2]);
                }
        
             
            }
        
            // Method to calculate win percentages and display final stats
            public static void displayFinalStats(int userWins, int computerWins, int draws, int totalGames) {
                double userWinPercentage = (double) userWins / totalGames * 100;
                double computerWinPercentage = (double) computerWins / totalGames * 100;
                double drawPercentage = (double) draws / totalGames * 100;
        
                System.out.println("\nFinal Statistics:");
                
                System.out.printf("%-15s %-10s %-10s\n", "Category", "Count", "Win %");
               
                System.out.printf("%-15s %-10d %-10.2f%%\n", "User Wins", userWins, userWinPercentage);
                System.out.printf("%-15s %-10d %-10.2f%%\n", "Computer Wins", computerWins, computerWinPercentage);
                System.out.printf("%-15s %-10d %-10.2f%%\n", "Draws", draws, drawPercentage);
               
            }
        }
        