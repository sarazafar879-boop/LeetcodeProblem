class Solution {
    public boolean solve(char[][] board, String word,int x, int y, int index) {
        if (index == word.length()) {
            return true;
        }

        // Checking boundaries
        if (x < 0 || x >= board.length ||
            y < 0 || y >= board[0].length) {
            return false;
        }

        // Character not same
        if (board[x][y] != word.charAt(index)) {
            return false;
        }

        // found
        char temp = board[x][y];
        board[x][y] = '#';

        // Checking all around
        boolean found =
            solve(board, word, x - 1, y, index + 1) || 
            solve(board, word, x + 1, y, index + 1) || 
            solve(board, word, x, y - 1, index + 1) || 
            solve(board, word, x, y + 1, index + 1);  

        board[x][y] = temp;

        return found;
    }

    public boolean exist(char[][] board, String word) {

        int m = board.length;
        int n = board[0].length;

        // Start from every cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (solve(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }
}