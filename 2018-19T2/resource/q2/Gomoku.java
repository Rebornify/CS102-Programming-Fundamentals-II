import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * The 15 X 15 board for the Gomoku game.
 */
public class Gomoku {
    private char[][] board;

    /**
     * Specific constructor
     *
     * @param board the sudoku board containing '#', 'X' or 'O'
     * @throws GameException   if the board is null or the board passed in does not have 15 rows
     *                                              or 15 columns. The content('X','O' or '#') need not be validated.
     */
    public Gomoku(char[][] board) {
        this.board = board;
    }

    /**
     * the player places a piece('X' or 'O') in the specified row and col
     * @param player the player ('X' or 'O')
     * @param row the row
     * @param col the col
     * @return true if after this move, the player wins. Otherwise, returns false.
     */

    public boolean placeMove(char player, int row, int col) {

        return false;

    }

    /**
     *
     * Counts the number of moves(either 'X' or 'O') we have in this direction.
     * Note: This method is idempotent (i.e. it counts and will not not modify the board
     *
     * @param player the value is either 'O' or 'X'
     * @param currentRow the row-position of the player's piece('X' or 'O')
     * @param currentCol the col-position of the player's piece('X' or 'O')
     * @param dir the direction(horizontally, vertically, or diagonally). We are counting for the number of pieces
     *            (either 'X' or 'O') that we have in this direction.
     * @return the number of moves we have in this direction. if the player does not match the move ('X' or '0')
     *         or the cell is empty, this method simply just returns 0.
     */
    public int count(char player, int currentRow, int currentCol, Direction dir) {
        return 0;

    }


}
