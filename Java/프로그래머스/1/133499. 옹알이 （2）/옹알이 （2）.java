class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String a = "aya";
        String y = "ye";
        String w = "woo";
        String m = "ma";

        for(int i=0; i<babbling.length; i++) {
            String word = babbling[i];
            int index = 0;
            String prev = ""; // 바로 전에 사용한 발음
            boolean possible = true;

            while(index < word.length()) {
                // 현재 위치에서 aya로 시작하고, 이전 발음이 aya가 아니면 가능
                if(word.startsWith(a, index) && !prev.equals(a)) {
                    index = index + a.length();
                    prev = a;
                }
                else if(word.startsWith(y, index) && !prev.equals(y)) {
                    index = index + y.length();
                    prev = y;
                }
                else if(word.startsWith(w, index) && !prev.equals(w)) {
                    index = index + w.length();
                    prev = w;
                }
                else if(word.startsWith(m, index) && !prev.equals(m)) {
                    index = index + m.length();
                    prev = m;
                }
                else {
                    possible = false;
                    break;
                }
            }

            if(possible == true) {
                answer = answer + 1;
            }
        }

        return answer;
    }
}