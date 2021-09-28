package app;

import entity.GameState;
import entity.SavedPosition;
import service.PositionOnTheGameBoard;
import service.Print_gameBoard;
import service.TicTacService;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicTacService service =new TicTacService();
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
        //Print_gameBoard.Print_Game_Board(gameBoard);
        while (true) {
            System.out.println("Vvedite your placement 1-9 :");
            int num = sc.nextInt();
            while (SavedPosition.playerPositions.contains(num) || SavedPosition.cpuPositions.contains(num)) {
                System.out.println("Position taken! Enter a correct Position");
                num = sc.nextInt();
            }
            System.out.println("Your place is: " + num);
            PositionOnTheGameBoard.installerOnPosition(gameBoard, num, "player");
            Random rand = new Random();
            int cpuNum = rand.nextInt(9) + 1;
            while (SavedPosition.playerPositions.contains(cpuNum) || SavedPosition.cpuPositions.contains(cpuNum)) {
                cpuNum = rand.nextInt(9) + 1;
            }
            PositionOnTheGameBoard.installerOnPosition(gameBoard, cpuNum, "cpu");
            Print_gameBoard.Print_Game_Board(gameBoard);
            GameState result1 = service.checkWinner(SavedPosition.playerPositions, SavedPosition.cpuPositions);
            GameState result = service.checkWinner( SavedPosition.playerPositions, SavedPosition.cpuPositions);

            if (!result.equals(GameState.CONTINUE)) {
                System.out.println(result);
                return;
            }
        }
    }
}

