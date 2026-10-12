class Solution {

    public boolean isafe(char[][] board, int x, int y) {

        int r, c;

        // column
        r = x - 1;
        c = y;

        while (r >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
        }

        // left diagonal
        r = x - 1;
        c = y - 1;

        while (r >= 0 && c >= 0) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
            c--;
        }

        // right diagonal
        r = x - 1;
        c = y + 1;

        while (r >= 0 && c < board.length) {
            if (board[r][c] == 'Q') {
                return false;
            }
            r--;
            c++;
        }

        return true;
    }

    public int solve(char[][] board, int x, int n) {
        if (x == n) {
            return 1;
        }

        int count = 0;

        for (int y = 0; y < n; y++) {

            if (isafe(board, x, y)) {

                board[x][y] = 'Q';

                count = count + solve(board, x + 1, n);

                // Backtracking
                board[x][y] = '.';
            }
        }

        return count;
    }

    public int totalNQueens(int n) {

        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        return solve(board, 0, n);
    }
}