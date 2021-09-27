package Package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckWinner {
    public static String checkWinner(List playerPositions,List cpuPositions) {
        List<Integer> topRow = Arrays.asList(1, 2, 3);
        List<Integer> midRow = Arrays.asList(3, 4, 5);
        List<Integer> botRow = Arrays.asList(6, 7, 8);

        List<Integer> leftCol = Arrays.asList(1, 4, 7);
        List<Integer> midCol = Arrays.asList(2, 5, 8);
        List<Integer> rightCol = Arrays.asList(3, 6, 9);

        List<Integer> cross1 = Arrays.asList(1, 5, 9);
        List<Integer> cross2 = Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);
        for(List l : winning) {
            if(playerPositions.containsAll(l)) {
                return "You won";
            } else if (cpuPositions.containsAll(l)){
                return "CPU won!";
            } else if (playerPositions.size() + cpuPositions.size() == 9){
                return "cat!";
            }
        }
        return "";
    }
}
