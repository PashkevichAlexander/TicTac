package service;

import app.Main;
import entity.SavedPosition;


public class PositionOnTheGameBoard {
    public static void installerOnPosition(char [][] gameBoard, int num, String User) {
        char symbol = 'X';
        if (User.equals("cpu"))
        {
            symbol = 'O';
            SavedPosition.cpuPositions.add(num);
        } else {
            SavedPosition.playerPositions.add(num);
        }
        switch (num){
            case 1 -> gameBoard [0][0] = symbol;
            case 2 -> gameBoard [0][2] = symbol;
            case 3 -> gameBoard [0][4] = symbol;
            case 4 -> gameBoard [2][0] = symbol;
            case 5 -> gameBoard [2][2] = symbol;
            case 6 -> gameBoard [2][4] = symbol;
            case 7 -> gameBoard [4][0] = symbol;
            case 8 -> gameBoard [4][2] = symbol;
            case 9 -> gameBoard [4][4] = symbol;
        }
    }
}
