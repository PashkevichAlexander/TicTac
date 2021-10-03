package service;

import entity.SavedPosition;

import java.util.Random;

public class TicTacAi {
    public static void makeMove() {
        Random rand = new Random();
        int cpuNum = rand.nextInt(9) + 1;
        while (SavedPosition.playerPositions.contains(cpuNum) || SavedPosition.cpuPositions.contains(cpuNum)) {
            cpuNum = rand.nextInt(9) + 1;
        }
    }
}
