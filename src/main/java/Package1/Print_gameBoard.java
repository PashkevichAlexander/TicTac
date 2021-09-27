package Package1;

public class Print_gameBoard {
    public static void Print_Game_Board(char[][] gameBoard) {

        for ( int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++ ) {
                System.out.print(gameBoard[i][j]);
            }
            System.out.println( );
        }
    }
}

