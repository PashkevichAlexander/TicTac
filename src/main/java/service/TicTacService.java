package service;

import entity.GameState;
import entity.WinnerCombination;

import java.util.List;

public class TicTacService {
    public GameState checkWinner(List<Integer> playerPositions, List<Integer> cpuPositions) {

        WinnerCombination winnerCombination = new WinnerCombination();

        for (List<Integer> integerList : winnerCombination.getWinnerCombination()) {
            if (playerPositions.containsAll(integerList)) {
                return GameState.PLAYER_WIN;
            }
            if (cpuPositions.containsAll(integerList)) {
                return GameState.COMPUTER_WIN;
            }
            if (playerPositions.size() + cpuPositions.size() == 9) {
                return GameState.DRAW;
            }
        }
        return GameState.CONTINUE;
    }
}
