import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> m = new HashMap<>();

        for(int i=0; i<players.length; i++) {
            m.put(players[i], i);
        }

        for(int i=0; i<callings.length; i++) {
            String name = callings[i];
            int idx = m.get(name);

            String front = players[idx - 1];

            players[idx - 1] = name;
            players[idx] = front;

            m.put(name, idx - 1);
            m.put(front, idx);
        }

        return players;
    }
}