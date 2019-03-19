package Games;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {


    String playerName; // Variable Names
    String playerMove;
    String computerMove;
    int score;
    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args){ // main method
        rockPaperScissors rps = new rockPaperScissors();
        rps.initialiseGame();
    }


    private void initialiseGame(){ // User Input - Asking the user to Enter Name to start game
        System.out.println("Enter your name: ");
        playerName = myScanner.nextLine();
        playGame();
    }

    private void playGame(){
        System.out.println("Enter your move: ");
        playerMove = myScanner.nextLine();
        System.out.println(playerName + " has selected " + playerMove + " as their move");
        computerMove = generateComputerMove(); // generating the computers move vs  the user
        String result = getWinner(playerMove, computerMove); // get winner of the match
        if(result.equalsIgnoreCase("Win")){ // print out if user wins the round
            System.out.println("Congratulations, you won this round!");
            score++;
        }
        else if(result.equalsIgnoreCase("Lose")){ // print out user has lost the round
            System.out.println("You lost this round!");
            score--;
        }
        else {
            System.out.println("This round was a draw!"); // draw round
        }

        if(score < 3 && score > -3){
            playGame();
        }
        else if(score == 3){ // print out if the user has won the whole game
            System.out.println("Winner Winner!!");
        }
        else if(score == -3){
            System.out.println("You Looooooosssseeeee!");
        }

    }

    private String generateComputerMove() { // generating  the computers move against user
        Random r = new Random(); // importing random will enable the computer to randomly to select next move
        String move = "";
        int i = r.nextInt(3); // Switch statement being used here using
        //A switch statement allows a variable to be tested for equality against a list of values.
        // Each value is called a case, and the variable being switched on is checked for each case.
        switch(i){
            case 0:
                move = "Rock";
                break;

            case 1:
                move = "Paper";
                break;

            case 2:
                move = "Scissors";
                break;
        }
        return move;
    }

    private String getWinner(String playerMove, String computerMove){ // random selection based on what the users pick for the game.
        // Also what the computer can pick randomly to beat the user
        String outcome = "";
        if(playerMove.equalsIgnoreCase("rock")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Draw";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Lose";
            }
            else{
                outcome = "Win";
            }
        }
        if(playerMove.equalsIgnoreCase("paper")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Win";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Draw";
            }
            else{
                outcome = "Lose";
            }
        }
        if(playerMove.equalsIgnoreCase("scissors")){
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Lose";
            }
            else if(computerMove.equalsIgnoreCase("paper")){
                outcome = "Win";
            }
            else{
                outcome = "Draw";
            }
        }
        return outcome; // return the outcome of the round
    }
}

