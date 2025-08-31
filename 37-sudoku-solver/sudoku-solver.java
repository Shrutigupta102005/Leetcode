class Solution {
    public void solveSudoku(char[][] board) {
        SudokuSolver(board, 0, 0);
    }

    public boolean SudokuSolver(char[][] board, int row, int col) {
        // base case: if we reached last row
        if (row == 9) {
            return true;
        }

        // move to next row if col == 9
        if (col == 9) {
            return SudokuSolver(board, row + 1, 0);
        }

        // skip pre-filled cells
        if (board[row][col] != '.') {
            return SudokuSolver(board, row, col + 1);
        }

        // try placing values '1' to '9'
        for (char ch = '1'; ch <= '9'; ch++) {
            if (isItsafe(board, row, col, ch)) {
                board[row][col] = ch;
                if (SudokuSolver(board, row, col + 1)) {
                    return true;
                }
                board[row][col] = '.'; // backtrack
            }
        }

        return false; // no value fits
    }

    public boolean isItsafe(char[][] board, int row, int col, char val) {
        // check column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == val) return false;
        }

        // check row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == val) return false;
        }

        // check 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == val) return false;
            }
        }

        return true;
    }
}
