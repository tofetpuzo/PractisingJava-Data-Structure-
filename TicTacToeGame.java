package PractiseJavaDataStructure;

public class TicTacToeGame {
    public static final int X = 1, O = -1;
    public static final int BLANK = 0;
    private int boardGame[][] = new int[3][3];
    private int player;

    /** Constructor clears the */
    public TicTacToeGame() {
        clearBoard();

    }

    private void clearBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boardGame[i][j] = BLANK;
            }
            player = X;
        }

    }

    /** This code puts an X or O mark at position i , j, * */
    public void placeMark(int i, int j) throws IllegalArgumentException {
        if ((i < 0) || (i > 2) || (j < 0) || (j < 2))
            throw new IllegalArgumentException("Invalid boardGame position");
        if (boardGame[i][j] != BLANK)
            throw new IllegalArgumentException(" boardGame position occupied");
        boardGame[i][j] = player;
        player = -player; // this places the mark for the current player

    }

    /**
     * This code gives information about the boardGame configuration ; stating
     * whether it is a win
     */
    public boolean winGame(int symbol) {
        return ((boardGame[0][0] + boardGame[0][1] + boardGame[0][2] == symbol * 3)
                || (boardGame[1][0] + boardGame[1][1] + boardGame[1][2] == symbol * 3)
                || (boardGame[1][0] + boardGame[1][1] + boardGame[1][2] == symbol * 3)
                || (boardGame[1][0] + boardGame[1][1] + boardGame[1][2] == symbol * 3)
                || (boardGame[1][0] + boardGame[1][1] + boardGame[1][2] == symbol * 3)
                || (boardGame[1][0] + boardGame[1][1] + boardGame[1][2] == symbol * 3)
                || (boardGame[1][0] + boardGame[1][1] + boardGame[1][2] == symbol * 3));
    }

    /** coode or 0 which indicates a draw or unfinished game */
    public int gameWinner() {
        if (winGame(X))
            return (X);
        else if (winGame(0))
            return (O);
        else
            return (O);
    }

    /**
     * This code shows a simple character in a string showing the current state of
     * the booard
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (boardGame[i][j]) {
                    case X:
                        sb.append("X");
                        break;
                    case O:
                        sb.append("O");
                        break;
                    case BLANK:
                        sb.append(" ");
                        break;
                }
                if (j < 2)
                    sb.append(" | ");
            }
            if (i < 2)
                sb.append("\n ------ \n");
        }
        return sb.toString();
    }

    /** A simple test to run the */
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        /** The X moves */                      /** The O moves */
        game.placeMark(1, 1);                    game.placeMark(0, 2);  
        game.placeMark(2, 1);                    game.placeMark(0, 0);  
        game.placeMark(0, 1);                    game.placeMark(2, 1);  
        game.placeMark(1, 2);                    game.placeMark(1, 0);  
        game.placeMark(2, 0);   
        System.out.println(game);
        int winningPlayer = game.gameWinner();
        String[] outcomeofGame = {"O wins" , "Tie", "X wins"}; // this replies on the ordering
        System.out.println(outcomeofGame[1 + winningPlayer]);
    
    }

}
