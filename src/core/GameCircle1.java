package core;

import java.util.ArrayList;

public class GameCircle1 {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Integer> player = new ArrayList<>();
        // Adding players to the list
        for (int i = 0; i < n; i++) {
            player.add(i + 1);
        }
        // Finding the winner
        int winner = playerNotPlayed(player);
        System.out.println("Winner is " + winner);
    }
    //  function to determine the winner
    public static int playerNotPlayed(ArrayList<Integer> players) {
        ArrayList<Integer> playerRearrange = new ArrayList<Integer>();
        //  return   player number
        if (players.size() == 1) {
            return players.get(0);
        }
        // Rearrange the players' positions
        for (int i = 2; i < players.size(); i++) {
            playerRearrange.add(players.get(i));
        }
        playerRearrange.add(players.get(1));

        // call the function with the rearranged players
        int winner = playerNotPlayed(playerRearrange);
        return winner;
    }
}
