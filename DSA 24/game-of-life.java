// class Solution {
//     public void gameOfLife(int[][] board) {
//         int rows = board.length, cols = board[0].length;
//         int[][] tempBoard = new int[rows][cols]; // we will first update values in this temporary matrix
//         for (int r = 0; r < rows; r++) {
//             for (int c = 0; c < cols; c++) {
//                 int liveNeighbors = neighbor(board, r - 1, c - 1) + neighbor(board, r - 1, c)
//                         + neighbor(board, r - 1, c + 1) + neighbor(board, r, c + 1) +
//                         neighbor(board, r + 1, c + 1) + neighbor(board, r + 1, c) + neighbor(board, r + 1, c - 1)
//                         + neighbor(board, r, c - 1);
//                 // System.out.println("cell: ("+r+","+c+") , liveNeighbors: "+liveNeighbors);
//                 if (board[r][c] == 1) {
//                     tempBoard[r][c] = (liveNeighbors < 2 || liveNeighbors > 3) ? 0 : 1; // update temporary matrix,
//                                                                                         // based on the rules in
//                                                                                         // question
//                 } else {
//                     tempBoard[r][c] = (liveNeighbors == 3) ? 1 : 0;
//                 }
//             }
//         }

//         for (int r = 0; r < rows; r++) {
//             board[r] = tempBoard[r].clone(); // copy all tempBoard elements back to board matrix
//         }
//     }

//     // ----------------------------------------------------------------------- //
//     public int neighbor(int[][] board, int r, int c) {
//         if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] == 0) {
//             return 0;
//         } // out of bound cases
//         return 1;
//     }
// }

// 0 ms, faster than 100.00%, memory 40.3 MB, less than 92.82%
// Time Complexity ~ O(m * n) and Space Complexity O(1)
// Before | After | Code
// 0 | 0 | 0
// 1 | 0 | 1
// 0 | 1 | 2
// 1 | 1 | 3




class Solution {
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int columns = board[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                int count = neighbor(board, r - 1, c - 1) + neighbor(board, r - 1, c) + neighbor(board, r - 1, c + 1)
                        + neighbor(board, r, c + 1) + neighbor(board, r + 1, c + 1) + neighbor(board, r + 1, c)
                        + neighbor(board, r + 1, c - 1) + neighbor(board, r, c - 1);

                if (board[r][c] == 1) {
                    if (count == 2 || count == 3)
                        board[r][c] = 3;
                } else if (count == 3)
                    board[r][c] = 2;
            }
        }
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (board[r][c] == 1)
                    board[r][c] = 0;
                else if (board[r][c] == 2 || board[r][c] == 3)
                    board[r][c] = 1;
            }
        }
    }

    public int neighbor(int[][] board, int r, int c) {

        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] == 0) {
            return 0;
        }
        int count = 0;

        if (board[r][c] == 1 || board[r][c] == 3) {
            count++;
        }

        return count;

    }

}