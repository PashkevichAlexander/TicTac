package service;

public class Print_gameBoard {
    public static void Print_Game_Board(char[][] gameBoard) {
        for (char[] chars : gameBoard) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                System.out.print(chars[j]);
            }
            System.out.println();
        }
    }
}

