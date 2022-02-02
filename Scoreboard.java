package PractiseJavaDataStructure;

/**  */
public class Scoreboard {
    private int numEntries = 0;
    private GameEntry[] board;

    /**
     * constructs an empty scoreboard with the given capacity for storing entries
     */
    public Scoreboard(int capacity) {
        board = new GameEntry[capacity];
    }

}
