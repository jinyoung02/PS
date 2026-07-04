class Solution {
    public String solution(String s) {
        String answer = "";

        if(s.length() % 2 == 1) {
            int a = s.length() / 2;
            answer = answer + s.charAt(a);
        }

        if(s.length() % 2 == 0) {
            int b = s.length() / 2;
            answer = answer + s.charAt(b - 1);
            answer = answer + s.charAt(b);
        }

        return answer;
    }
}