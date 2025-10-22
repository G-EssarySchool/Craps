import java.util.Random;

public class Craps {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Welcome to the Craps Simulator!");
        System.out.println("Rule 1: If the sum is 2, 3, or 12 it is called 'crapping out' and the game is over with a lose.");
        System.out.println("Rule 2: If the sum if 7 or 11 it is called a 'natural' and the game is over with a win.");
        System.out.println("Rule 3: For all other values, the sum becomes 'the point' and the user rolls until \nthey either roll a 7, in which case they lose, or they roll the point sum in which case they win.");

    }
}