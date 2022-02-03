package PractiseJavaDataStructure;

/**  */
public class TetrisScoreboard {
    private int numEntries = 0; // number of actual entries
    private TetrisEntry[] board; // array of game scores (names & scores)

    /**
     * constructs an empty scoreboard with the given capacity for storing entries
     */
    public TetrisScoreboard(int capacity) {
        board = new TetrisEntry[capacity];
    }

    /** Attempt to add a new score to the collection (if it is high score ) */
    public void add(TetrisEntry e) {
        int newScore = e.getScore();
        // is the new entry e really a high score?
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            if (numEntries < board.length) // no score drops from the board
                numEntries++; // so overall number increases
            // shift any lower scores rightward to make a room for the new entry
            int game_entry_index = numEntries - 1;
            while (game_entry_index > 0 && board[game_entry_index - 1].getScore() < newScore) {
                board[game_entry_index] = board[game_entry_index - 1]; // move the position to the new position
                game_entry_index--;
            }
            {
                board[game_entry_index] = e;

            }

        }
    }

    /** How to remove data from an array the implementation */
    public TetrisEntry removeEntry(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= numEntries)
            throw new IndexOutOfBoundsException("Invalid: " + i);
        TetrisEntry temp = board[i]; // keep the object which will be removed...
        for (int j = i; j < numEntries - 1; i++) { //This iteration helps us count score from where we want to remove
            board[j] = board[j + 1];
            board[numEntries - 1] = null;
        } numEntries--;
        return temp;
    }

    /** Insertion-sort of an array of characters into non-descending  */
        public static void insertionSort(char[] data){
            
    }


}
