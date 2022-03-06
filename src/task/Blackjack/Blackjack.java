package task.Blackjack;
import java.util.Scanner;

public class Blackjack {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        //input
        System.out.print("Enter player 1's hand-value");
        int player1 = scan.nextInt();
        System.out.print("Enter player 2's hand-value");
        int player2 = scan.nextInt();

        //Both Bust > 21
        if ((player1 > 21)&&(player2 >21))
        System.out.println("Both BUst");
        else if ((player1 > 21)&& (player2 <=21))
        System.out.println("Player 2 wins");
        else if ((player1 <= 21)&& (player2 >21))
        System.out.println("Player 1 wins");
        // Tie
        else if (player2 == player1)
        System.out.println("Its a DRAW");
        //Player 1 win
        else if (player1 > player2)
            System.out.println("Player 1 WINS");
        //Player 2 win
        else if (player2 > player1)
            System.out.println("Player 2 WINS");
        else
            System.out.println("should never print");
    }

}