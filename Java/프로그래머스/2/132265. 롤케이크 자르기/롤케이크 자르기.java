import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<topping.length; i++) {
            if(map.containsKey(topping[i])) {
                map.put(topping[i], map.get(topping[i]) + 1);
            }
            else {
                map.put(topping[i], 1);
            }
        }

        for(int i=0; i<topping.length - 1; i++) {
            int t = topping[i];

            set.add(t);

            map.put(t, map.get(t) - 1);

            if(map.get(t) == 0) {
                map.remove(t);
            }

            if(set.size() == map.size()) {
                answer += 1;
            }
        }

        return answer;
    }
}