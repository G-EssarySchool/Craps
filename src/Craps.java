import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String playAgain;
        boolean keepPlaying = true;

        System.out.println("Welcome to the Craps Simulator!");
        System.out.println("Rule 1: If the sum is 2, 3, or 12 it is called 'crapping out' and the game is over with a lose.");
        System.out.println("Rule 2: If the sum if 7 or 11 it is called a 'natural' and the game is over with a win.");
        System.out.println("Rule 3: For all other values, the sum becomes 'the point' and the user rolls until \nthey either roll a 7, in which case they lose, or they roll the point sum in which case they win.");
        System.out.println();

        while (keepPlaying) {
            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("Roll 1: " + die1);
            System.out.println("Roll 2: " + die2);
            System.out.println("Sum: " + sum);

            if (sum == 7 || sum == 11) {
                System.out.println("You win!");
            } else if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Sorry, you crapped out.");
            } else {
                int point = sum;
                System.out.println("The point is now: " + point);

                boolean rolling = true;
                while (rolling) {
                    die1 = rand.nextInt(6) + 1;
                    die2 = rand.nextInt(6) + 1;
                    sum = die1 + die2;

                    System.out.println("Roll 1: " + die1);
                    System.out.println("Roll 2: " + die2);
                    System.out.println("Sum: " + sum);

                    if (sum == point) {
                        System.out.println("You made your point, you win!");
                        rolling = false;
                    } else if (sum == 7) {
                        System.out.println("You rolled a 7, you lose.");
                        rolling = false;
                    } else {
                        System.out.println("Rerolling, you must get the point to win, A roll of 7 will result in a loss");
                    }
                }
            }

            System.out.print("\nPlay again? [Y/N]: ");
            playAgain = input.next().toLowerCase();

            if (!playAgain.equals("y") && !playAgain.equals("yes")) {
                keepPlaying = false;
            }

            System.out.println();
        }
    }
}
