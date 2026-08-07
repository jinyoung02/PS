import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> set = new HashSet<>();

        // 첫 단어는 비교할 이전 단어가 없으니 먼저 저장
        set.add(words[0]);

        for(int i=1; i<words.length; i++) {
            String before = words[i - 1];
            String now = words[i];

            // 이전 단어의 마지막 글자, 현재 단어의 첫 글자
            char last = before.charAt(before.length() - 1);
            char first = now.charAt(0);

            if(last != first || set.contains(now)) {
                answer[0] = (i % n) + 1; // 탈락한 사람 번호
                answer[1] = (i / n) + 1; // 그 사람의 차례
                return answer;
            }

            set.add(now);
        }

        return answer;
    }
}