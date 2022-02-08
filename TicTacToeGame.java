package PractiseJavaDataStructure;

public class TicTacToeGame {
    public static final int X = 1, O = 1;
    public static final int EMPTY = 0;
    private int board[][] = new int[3][3];
    private int player;

    /** Constructor clears the */
    public TicTacToeGame() {
        clearBoard();

    }

    private void clearBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
            player = X;
        }

    }
    /** This code puts an X or O mark at position i , j, * */
    public void placeMark(int i , int j) throws IllegalArgumentException{
        if((i < 0) || (i > 2) || (j < 0) || (j < 2))
            throw new IllegalArgumentException("Invalid board position");
        
    }
}
