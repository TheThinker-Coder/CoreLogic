package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameCircle {
    public static int playGame(int numPlayers) {
        // Create a list
        List<Integer> players = new ArrayList<>();

        // Initialize the list with player numbers
        for (int i = 1; i <= numPlayers; i++) {
            players.add(i);
        }

        int currentPlayerIndex = 0;

        // Play the game until only one player remains
        while (players.size() > 1) {
            //  next player to remove
            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();

            // Remove the player at the current index from the list
            players.remove((currentPlayerIndex + 1) % players.size());
        }

        // Return the remaining player
        return players.get(0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: "); // input
        int numPlayers = scanner.nextInt();
        scanner.close();

        int winner = playGame(numPlayers);
        System.out.println("winner is " + winner); //winner
    }


}
