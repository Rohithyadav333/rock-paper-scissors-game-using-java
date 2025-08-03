import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] options = {"rock", "paper", "scissors"};
        System.out.println("Welcome to Rock, Paper, Scissors!");
        
        while (true) {
            System.out.print("\nEnter your move (rock, paper, scissors). Type 'exit' to quit: ");
            String userMove = sc.nextLine().toLowerCase();

            if (userMove.equals("exit")) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (!Arrays.asList(options).contains(userMove)) {
                System.out.println("Invalid move! Please try again.");
                continue;
            }

            String computerMove = options[rand.nextInt(3)];
            System.out.println("Computer chose: " + computerMove);

            if (userMove.equals(computerMove)) {
                System.out.println("It's a draw!");
            } else if (
                (userMove.equals("rock") && computerMove.equals("scissors")) ||
                (userMove.equals("scissors") && computerMove.equals("paper")) ||
                (userMove.equals("paper") && computerMove.equals("rock"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }
        sc.close();
    }
}
