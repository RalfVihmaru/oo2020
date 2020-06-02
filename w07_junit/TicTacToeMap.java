public class TicTacToeMap {
    
    public static char [] [] gameBoard = {
        {' ', '¦', ' ', '¦', ' '}, 
        {'-', '+', '-', '+', '-'}, 
        {' ', '¦', ' ', '¦', ' '}, 
        {'-', '+', '-', '+', '-'}, 
        {' ', '¦', ' ', '¦', ' '}
    };

    public static void printGameBoard(){
        for(char [] row : gameBoard) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}