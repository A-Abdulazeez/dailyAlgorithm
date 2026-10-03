import java.util.HashSet;
import java.util.Set;

public class SodukuBoard {

    public boolean isRowValid(char[][] board) {
        for (int index = 0; index < 9; index++) {
            Set<Character> row = new HashSet<>();

            for (int index2 = 0; index2 < 9; index2++) {
                if (board[index][index2] != '.') {
                    if (row.contains(board[index][index2])) {
                        return false;
                    }
                    row.add(board[index][index2]);
                }
            }
        }

        return true;
    }

    public boolean isColumnValid(char[][] board) {
        for (int index = 0; index < 9; index++) {
            Set<Character> column = new HashSet<>();

            for (int index2 = 0; index2 < 9; index2++) {
                if (board[index2][index] != '.') {
                    if (column.contains(board[index2][index])) {
                        return false;
                    }
                    column.add(board[index2][index]);
                }
            }
        }
        return true;
    }

    public boolean isSquareValid(char[][] board) {
        for (int startRow = 0; startRow < 9; startRow += 3) {
            for (int startColumn = 0; startColumn < 9; startColumn += 3) {
                Set<Character> box = new HashSet<>();

                for (int row = startRow; row < startRow + 3; row++) {
                    for (int column = startColumn; column < startColumn + 3; column++) {
                        if (board[row][column] != '.') {

                            if (box.contains(board[row][column])) {
                                return false;
                            }

                            box.add(board[row][column]);
                        }
                    }
                }
            }
        }

        return true;
    }

    public boolean isBoardValid(char[][] board) {
        return isRowValid(board) && isColumnValid(board) && isSquareValid(board);
    }

}
