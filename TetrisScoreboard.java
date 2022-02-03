package PractiseJavaDataStructure;

import java.util.Random;

import javax.print.event.PrintJobListener;
import javax.sound.sampled.SourceDataLine;

import java.lang.reflect.Array;
import java.util.Arrays;

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
        for (int j = i; j < numEntries - 1; i++) { // This iteration helps us count score from where we want to remove
            board[j] = board[j + 1];
            board[numEntries - 1] = null;
        }
        numEntries--;
        return temp;
    }

    /** Insertion-sort of an array of characters into non-descending */
    public static void insertionSort(char[] data) {
        int n = data.length;
        for (int k = 1; k < n; k++) { // begin with second character
            char current_value = data[k]; // time to insert current_value
            int j = k; // insert the exact index j for char current_value
            while (j > 0 && data[j - 1] > current_value) { // thus data[j -1] must go after cuurent_value
                data[j] = data[j - 1]; //
                j--;
            }
            data[j] = current_value;
        }

    }

    /** a code to illustrate the Array sorting using pseudocode */
    public class TestingArraySorting {
        public static void main(String[] args) {
            int dataset[] = new int[10];
            Random randoms = new Random(); // this generates pseudorandom numbers at run time
            randoms.setSeed(System.currentTimeMillis()); // I used the current time of any system running this program
            for (int i = 0; i < dataset.length; i++) {
                dataset[i] = randoms.nextInt(100);
                int[] original_copy = Arrays.copyOf(dataset, dataset.length);
                System.out.println("Arrays are equal before sorting: " + Arrays.equals(dataset, original_copy));
                Arrays.sort(dataset);
                System.out.println();
                System.out.println("Arrays are equal after sorting: " + Arrays.equals(dataset, original_copy));
                System.out.println("original_copy= " + Arrays.toString(original_copy));
                System.out.println("original_copy= " + Arrays.toString(dataset));

            }

        }

    }

}
