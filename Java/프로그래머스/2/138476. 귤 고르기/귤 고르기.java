import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<tangerine.length; i++) {
            int size = tangerine[i];

            if(map.containsKey(size)) {
                map.put(size, map.get(size) + 1);
            }
            else {
                map.put(size, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int count : map.values()) {
            list.add(count);
        }

        Collections.sort(list, Collections.reverseOrder());

        for(int i=0; i<list.size(); i++) {
            k = k - list.get(i);
            answer = answer + 1;

            if(k <= 0) {
                break;
            }
        }

        return answer;
    }
}