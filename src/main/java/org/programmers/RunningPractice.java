package org.programmers;
public class RunningPractice {
    public String[] solution(String[] players, String[] callings) {
        for (int i = 0; i < callings.length; ++i) {
            for (int j = 0; j < players.length; ++j) {
                if (callings[i].equals(players[j])) {
                    String temp = players[j-1];
                    players[j-1] = players[j];
                    players[j] = temp;
                    break;
                }
            }
        }
        return players;
    }
}
