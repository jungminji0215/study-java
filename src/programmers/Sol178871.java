package programmers;

import java.util.Arrays;

public class Sol178871 {
    public static void main(String[] args) {
        String[] players = new String[5];
        players[0] = "mumu";
        players[1] = "soe";
        players[2] = "poe";
        players[3] = "kai";
        players[4] = "mine";

        String[] callings = new String[4];
        callings[0] = "kai";
        callings[1] = "kai";
        callings[2] = "mine";
        callings[3] = "mine";

        String[] result = solution(players, callings);
        System.out.println(Arrays.toString(result));
    }

    public static String[] solution(String[] players, String[] callings) {
        for(String calling: callings){
            // players 에서 callings 에서 조회한 선수의 위치를 찾는다.
            // 따라잡은 선수 위치 : index
            // 따라잡힌 선수 위치 : index-1
            int index = Arrays.asList(players).indexOf(calling);

            changePlayerIndex(players, calling, index);
        }

        return players;
    }

    public static void changePlayerIndex(String[] players, String calling, int index) {
        players[index] = players[index-1];
        players[index-1] = calling;
    }
}
