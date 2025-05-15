import java.util.Scanner;

public class Question9_RockPaperScissors {

    public static String getComputerChoice() {
        double rand = Math.random();
        if (rand < 1.0 / 3) {
            return "rock";
        } else if (rand < 2.0 / 3) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }
        if (userChoice.equals("rock")) {
            return computerChoice.equals("scissors") ? "User" : "Computer";
        } else if (userChoice.equals("paper")) {
            return computerChoice.equals("rock") ? "User" : "Computer";
        } else if (userChoice.equals("scissors")) {
            return computerChoice.equals("paper") ? "User" : "Computer";
        }
        return "Invalid";
    }

    public static String[][] calculateStats(int userWins, int computerWins, int draws, int totalGames) {
        String[][] stats = new String[4][2];
        stats[0][0] = "User Wins";
        stats[0][1] = String.valueOf(userWins);
        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);
        stats[2][0] = "Draws";
        stats[2][1] = String.valueOf(draws);
        stats[3][0] = "Total Games";
        stats[3][1] = String.valueOf(totalGames);
        return stats;
    }

    public static void displayStats(String[][] stats) {
        System.out.println("Stat\tValue");
        for (String[] stat : stats) {
            System.out.println(stat[0] + "\t" + stat[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int numGames = scanner.nextInt();
        scanner.nextLine(); // consume newline

        int userWins = 0;
        int computerWins = 0;
        int draws = 0;

        for (int i = 1; i <= numGames; i++) {
            System.out.print("Game " + i + " - Enter your choice (rock, paper, scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            String computerChoice = getComputerChoice();
            System.out.println("Computer choice: " + computerChoice);

            String winner = findWinner(userChoice, computerChoice);
            if (winner.equals("User")) {
                userWins++;
                System.out.println("You win!");
            } else if (winner.equals("Computer")) {
                computerWins++;
                System.out.println("Computer wins!");
            } else if (winner.equals("Draw")) {
                draws++;
                System.out.println("It's a draw!");
            } else {
                System.out.println("Invalid input. No winner for this game.");
            }
        }

        String[][] stats = calculateStats(userWins, computerWins, draws, numGames);
        displayStats(stats);

        double userWinPercent = (userWins * 100.0) / numGames;
        double computerWinPercent = (computerWins * 100.0) / numGames;

        System.out.printf("User winning percentage: %.2f%%\n", userWinPercent);
        System.out.printf("Computer winning percentage: %.2f%%\n", computerWinPercent);

        scanner.close();
    }
}
