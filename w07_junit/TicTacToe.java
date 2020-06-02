import java.util.Random;
import java.util.Scanner;

public class TicTacToe {


    public static void main(String[] args){

        TicTacToeMap.printGameBoard();

        while(true){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your placement (1-9): ");
            int playerPos = scan.nextInt();
            
            while (TicTacToePlayer.playerPositions.contains(playerPos) || TicTacToePlayer.cpuPositions.contains(playerPos)){
                System.out.println("Positsioon juba valitud, valige uus positsioon");
                playerPos = scan.nextInt();
            }
                
            String result = TicTacToePlayer.checkWinner();
            if(result.length()>0){
                System.out.println(result);
                break;
            }
            //System.out.println(pos);
    
            TicTacToePlayer.setPosition(TicTacToeMap.gameBoard, playerPos, "player");
    
            Random rand = new Random();
            int cpuPos = rand.nextInt(9) +1;

            while (TicTacToePlayer.playerPositions.contains(cpuPos) || TicTacToePlayer.cpuPositions.contains(cpuPos)){
                cpuPos = rand.nextInt(9) +1;
            }

            TicTacToePlayer.setPosition(TicTacToeMap.gameBoard, cpuPos, "cpu");

            TicTacToeMap.printGameBoard();

            result = TicTacToePlayer.checkWinner();
            if(result.length()>0){
                System.out.println(result);
                break;
            }

            System.out.println(result);
        }
    }
}