package PractiseJavaDataStructure;
public class GameEntry {

    private String name;
    private int score;
    public GameEntry(String n, int s) {
        this.name = n;
        this.score = s;
    }

    // returns the name field
    public String getName() {
        return name;
    }

    /** returns the score field */
    public int getScore() {
        return score;
    }

    /** returns a string representation of this entry */
    public String toString() {
        return "(" + name + ", " + score + ")";
    }

    /* Constructs a game entry with given parameters */
    public static void main(String[] args) {

    }
}