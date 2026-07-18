class Solution {
    public int solution(String s) {
        int answer = 0;
        int a = 0; // 같은 문자 개수
        int b = 0; // 다른 문자 개수
        char x = s.charAt(0);

        for(int i=0; i<s.length(); i++) {

            if(a == 0 && b == 0) {
                x = s.charAt(i);
            }

            if(s.charAt(i) == x) {
                a += 1;
            }
            else {
                b += 1;
            }

            if(a == b) {
                answer += 1;
                a = 0;
                b = 0;
            }
        }

        if(a != 0 || b != 0) {
            answer += 1;
        }

        return answer;
    }
}