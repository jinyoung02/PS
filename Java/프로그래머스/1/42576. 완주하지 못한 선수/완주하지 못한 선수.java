import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> s = new HashMap<>();

        // 이름 개수 저장
        for(int i=0; i<participant.length; i++) {
            String name = participant[i];

            if(s.containsKey(name)) {
                s.put(name, s.get(name) + 1);
            }
            else {
                s.put(name, 1);
            }
        }

        // 완주한 사람은 개수 줄이기
        for(int i=0; i<completion.length; i++) {
            String same = completion[i];

            if(s.containsKey(same)) {
                s.put(same, s.get(same) - 1);
            }
        }

        for(String name : s.keySet()) {
            if(s.get(name) > 0) {
                answer = name;
            }
        }

        return answer;
    }
}