package Package1;

import java.util.*;

public class Main {
    static ArrayList<Integer> playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer> cpuPositions = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
        //Print_gameBoard.Print_Game_Board(gameBoard);
        while (true) {
            System.out.println("Vvedite your placement 1-9 :");
            int num = sc.nextInt();
            while (playerPositions.contains(num) || cpuPositions.contains(num)) {
                System.out.println("Position taken! Enter a correct Position");
                num = sc.nextInt();
            }
            System.out.println("Your place is: " + num);
            PlacePiece.placePiece(gameBoard, num, "player");
            String result = CheckWinner.checkWinner( playerPositions, cpuPositions);
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }
            Random rand = new Random();
            int cpuNum = rand.nextInt(9) + 1;
            while (playerPositions.contains(cpuNum) || cpuPositions.contains(cpuNum)) {
                cpuNum = rand.nextInt(9) + 1;
            }
            PlacePiece.placePiece(gameBoard, cpuNum, "cpu");
            Print_gameBoard.Print_Game_Board(gameBoard);
            result = CheckWinner.checkWinner(playerPositions, cpuPositions);
            if (result.length() > 0) {
            System.out.println(result);
            break;
            }
        }
    }
}

