package PractiseJavaDataStructure;

/**  */
public class Scoreboard {
    private int numEntries = 0; // number of actual entries
    private GameEntry[] board;  // array of game entries (names & scores)

    /**
     * constructs an empty scoreboard with the given capacity for storing entries
     */
    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }

    /** Attempt to add a new score to the collection (if it is high score ) */
    public void add(GameEntry e) {
        int newScore = e.getScore();
        // is the new entry e really a high score?
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            if (numEntries < board.length)  //no score drops from the board
                numEntries ++;
            
        }
    }
}
