package mini_project;
import java.util.*;

public class TicTacToe {

    private static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };
    public static void main(String[] args) {

        //printBoard(board);
        System.out.println("Tic Tac Toe is ready for play Human vs AI!\n");
        //boolean player1 = true;
        //Create a gameEnded boolean and use it as the condition in the while loop
        boolean gameEnded = false;
        char humanPlayer='X',computerPlayer='O';
        while (!gameEnded){
            printBoard(board);
            if (gameEnded) {
                break; // Exit the loop if the game has ended
            }
            System.out.println("its human turn");
            humanMove();
            if(win_or_tie_check(board)==true){ break; };
            printBoard(board);
            System.out.println("It's AI's turn");
            int[] bestMove = minimax(board, computerPlayer);
            // Update the board with the computer's move
            board[bestMove[0]][bestMove[1]] = computerPlayer;
            if(win_or_tie_check(board)==true){
                printBoard(board);
                break;
            };

        }

    }

    private static boolean win_or_tie_check(char[][] board){
        if (isWinner(board, 'X')==true) {
            System.out.println("You are WInner");
            return true;
        } else if (isWinner(board, 'O')==true) {
            System.out.println("Computer is Winner");
            return true;
        } else if (isBoardFull(board)==true) {
            System.out.println("Match is tie");
            return true;
        }
        return false;
    }

    private static int[] minimax(char[][] board, char player) {
        int[] bestMove = {-1, -1};
        int bestScore = (player == 'O') ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = player;
                    int score = minimaxScore(board, player);
                    board[i][j] = ' ';

                    if ((player == 'O' && score > bestScore) || (player == 'X' && score < bestScore)) {
                        bestScore = score;
                        bestMove[0] = i;
                        bestMove[1] = j;
                    }
                }
            }
        }

        return bestMove;
    }

    private static boolean isWinner(char[][] board, char player) {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    private static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // If an empty space is found, the board is not full
                }
            }
        }
        return true; // If no empty space is found, the board is full
    }

    private static int minimaxScore(char[][] board, char player) {
        if (isWinner(board, 'X')) {
            return -1;
        } else if (isWinner(board, 'O')) {
            return 1;
        } else if (isBoardFull(board)) {
            return 0;
        }

        char opponent = (player == 'O') ? 'X' : 'O';
        int bestScore = (player == 'O') ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    board[i][j] = player;
                    int score = minimaxScore(board, opponent);
                    board[i][j] = ' ';

                    if ((player == 'O' && score > bestScore) || (player == 'X' && score < bestScore)) {
                        bestScore = score;
                    }
                }
            }
        }

        return bestScore;
    }


    private static void humanMove() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-9) to make your move: ");
        int moveNumber = scanner.nextInt();

        int[] coordinates = convertNumberToCoordinates(moveNumber);

        int row = coordinates[0];
        int col = coordinates[1];

        if (isValidMove(row, col)) {
            board[row][col] = 'X';
        } else {
            System.out.println("Invalid move. Try again.");
            humanMove(); // Recursive call to retry the move
        }
    }

    private static int[] convertNumberToCoordinates(int number) {
        int size = 3; // Assuming a 3x3 Tic Tac Toe board
        int position = number - 1;

        switch (position) {
            case 0: return new int[]{0, 0};
            case 1: return new int[]{0, 1};
            case 2: return new int[]{0, 2};
            case 3: return new int[]{1, 0};
            case 4: return new int[]{1, 1};
            case 5: return new int[]{1, 2};
            case 6: return new int[]{2, 0};
            case 7: return new int[]{2, 1};
            case 8: return new int[]{2, 2};
            default: return new int[]{-1, -1}; // Invalid number
        }
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    private static void printBoard(char[][] board) {
        //System.out.println("\u001B[31mTic Tac Toe Board:\u001B[0m");
        System.out.println("\u001B[33mTic Tac Toe Board:\u001B[0m");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\u001B[32m " + board[i][j] + " \u001B[0m");
                if (j < 2) {
                    System.out.print("\u001B[32m|\u001B[0m");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("\u001B[32m-----------\u001B[0m");
            }
        }
        System.out.println();
    }

    //To convert i j coordinates i values 1-9 in board
    /*private static int convertCoordinatesToNumber(int row, int col) {
        switch (row * 3 + col + 1) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            default:
                return -1; // Invalid coordinates
        }
    } */
}
