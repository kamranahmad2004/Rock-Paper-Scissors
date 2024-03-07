import java.util.*;

public class Simple_Game
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("\n  -------- WELCOME TO ROCK PAPER SCISSORS GAME ---------\n");
        // 1. Computer Move

        String[] moves = { "Rock", "Paper", "Scissors" };
        String computer_move = moves[new Random().nextInt(moves.length)]; 
        boolean condition = true;
        int comp = 0, player = 0;
        int tie = 0;
        while (condition) {

            System.out.println("Oponent have choosen it's move");
            System.out.println("  --- It's your turn now ---");
            System.out.println();
            // 2. Player move
            String player_move;
            System.out.println("[1]. Rock \n[2]. Paper \n[3]. Scissors \n[4]. Quit");
            System.out.println();
            System.out.print("Select your move: ");
            player_move = input.nextLine();
            System.out.println();

            // Checking user input
            if (player_move.equalsIgnoreCase("Rock") || player_move.equalsIgnoreCase("Paper") || player_move.equalsIgnoreCase("Scissors")) 
            {
                System.out.println("Oponent chooses : " + computer_move);
                System.out.println("You chooses : " + player_move);
                System.out.println();
            } 
            else if (player_move.equalsIgnoreCase("Quit")) 
            {
                break;
            } 
            else 
            {
                System.out.println("Invalid Statement! ");
                System.out.println("Please enter available moves from list ");
                System.out.println();
            }

            // Calculating Results

            if (player_move.equalsIgnoreCase(computer_move)) 
            {
                System.out.println("It becomes draw in this Stage");
                System.out.println("_________________________ \n");
                tie++;
            }

            switch (player_move) 
            {
                case "Rock":
                case "rock":
                    if (computer_move.equalsIgnoreCase("Paper")) 
                    {
                        System.out.println("Oponent wins this Stage");
                        System.out.println("_________________________ \n");
                        comp++;
                    }

                    else if (computer_move.equalsIgnoreCase("Scissors")) 
                    {
                        System.out.println("You win this Stage");
                        System.out.println("_________________________ \n");
                        player++;
                    }
                    break;

                case "Paper":
                case "paper":
                    if (computer_move.equalsIgnoreCase("Rock")) 
                    {
                        System.out.println("You win this Stage");
                        System.out.println("_________________________ \n");
                        player++;
                    }

                    else if (computer_move.equalsIgnoreCase("Scissors")) 
                    {
                        System.out.println("Oponent wins this Stage");
                        System.out.println("_________________________ \n");
                        comp++;
                    }
                    break;

                case "Scissors":
                case "scissors":
                    if (computer_move.equalsIgnoreCase("Rock")) 
                    {
                        System.out.println("Oponent wins this Stage");
                        System.out.println("_________________________ \n");
                        comp++;
                    }

                    else if (computer_move.equalsIgnoreCase("Paper")) 
                    {
                        System.out.println("You wins this Stage");
                        System.out.println("_________________________ \n");
                        player++;
                    }

                default:
                    break;
            }
        }

        // Calculate overall Result
        System.out.println();
        System.out.println(" ----- || OVERALL RESULT OF GAME || ------ ");

        System.out.println("\n Computer wins " + comp + " Stages");
        System.out.println(" You wins " + player + " Stages");
        System.out.println(" Tie in " + tie + " Stages\n");

        if (comp > player) 
        {
            System.out.println(" ------ Oponent wins this Game, better luck next time! ----- ");
            System.out.println();
        }

        else if (player > comp) 
        {
            System.out.println(" ------- Congratulations! you wins this Game!! ------- ");
            System.out.println();
        }

        else
        {
            System.out.println(" ------- It's tie in Game ------- ");
            System.out.println();
        }
        System.out.println("Thanks for playing this Game. Hopefully it would be enjoyable for you.");
        System.out.println();
    }
}