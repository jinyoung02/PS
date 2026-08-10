import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> m = new HashMap<>();

        for(int i=0; i<clothes.length; i++) {
            String t = clothes[i][1];

            if(m.containsKey(t)) {
                m.put(t, m.get(t) + 1);
            }
            else {
                m.put(t, 1);
            }
        }

        for(String t : m.keySet()) {
            answer = answer * (m.get(t) + 1);
        }

        return answer - 1;
    }
}