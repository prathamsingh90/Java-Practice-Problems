import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        Random rand = new Random();

        // Random pick by player 1
        int pick1 = rand.nextInt(2);

        Scanner input = new Scanner(System.in);

        // Keyboard input for player 2
        int pick2 = input.nextInt();

        String player1, player2;

        // Player1 pick
        switch(pick1){
           case 0->{
           player1="Rock";
           }
           case 1->{
            player1="Paper";
           }
           case 2->{
            player1="Scissor";
           }
           default->{
            player1="Invalid";
           }
        }

        // Player2 pick
        switch(pick2){
            case 0->{
            player2="Rock";
            }
            case 1->{
             player2="Paper";
            }
            case 2->{
             player2="Scissor";
            }
            default->{
             player2="Invalid";
            }           
        }

        System.out.printf("Player 1 choose %s and Player 2 choose %s\n", player1, player2);
        if (player1=="Invalid" || player2 =="Invalid") {
            System.out.println("Invalid response by a player");
            System.exit(0);
        }else if ((player1=="Rock"&& player2=="Paper")||(player1=="Scissor"&&player2=="Rock")||(player1=="Paper"&&player2=="Scissor")){
            System.out.println("Player2 won");
        } else if ((player2=="Rock"&& player1=="Paper")||(player2=="Scissor"&&player1=="Rock")||(player2=="Paper"&&player1=="Scissor")){
            System.out.println("Player1 won");
        } else {
            System.out.println("No Result");
        }
        input.close();
    }
}
