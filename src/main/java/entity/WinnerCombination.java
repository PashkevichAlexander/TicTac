package entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WinnerCombination {
    private final List<List<Integer>> winnerCombination;

    public WinnerCombination() {
        List<Integer> topRow = Arrays.asList(1, 2, 3);
        List<Integer> midRow = Arrays.asList(4, 5, 6);
        List<Integer> botRow = Arrays.asList(7, 8, 9);

        List<Integer> leftCol = Arrays.asList(1, 4, 7);
        List<Integer> midCol = Arrays.asList(2, 5, 8);
        List<Integer> rightCol = Arrays.asList(3, 6, 9);

        List<Integer> cross1 = Arrays.asList(1, 5, 9);
        List<Integer> cross2 = Arrays.asList(7, 5, 3);

        winnerCombination = new ArrayList<>();

        winnerCombination.add(topRow);
        winnerCombination.add(midRow);
        winnerCombination.add(botRow);
        winnerCombination.add(leftCol);
        winnerCombination.add(midCol);
        winnerCombination.add(rightCol);
        winnerCombination.add(cross1);
        winnerCombination.add(cross2);
    }

    public List<List<Integer>> getWinnerCombination() {
        return winnerCombination;
    }
}
