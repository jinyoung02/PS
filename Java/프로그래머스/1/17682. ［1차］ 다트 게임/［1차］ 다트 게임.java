class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] p = new int[3];

        int a = 0; // 문자열 위치
        int b = 0; // 점수 배열 위치

        while(a < dartResult.length()) {
            int num = 0;

            // 점수 확인
            if(dartResult.charAt(a) == '1' && a + 1 < dartResult.length() && dartResult.charAt(a + 1) == '0') {
                num = 10;
                a = a + 2;
            }
            else {
                num = dartResult.charAt(a) - '0';
                a = a + 1;
            }

            // 보너스 확인
            if(dartResult.charAt(a) == 'S') {
                p[b] = num;
            }
            else if(dartResult.charAt(a) == 'D') {
                p[b] = num * num;
            }
            else if(dartResult.charAt(a) == 'T') {
                p[b] = num * num * num;
            }

            a += 1;

            // 옵션 확인
            if(a < dartResult.length()) {
                if(dartResult.charAt(a) == '*') {
                    p[b] = p[b] * 2;

                    if(b > 0) {
                        p[b - 1] = p[b - 1] * 2;
                    }

                    a += 1;
                }
                else if(dartResult.charAt(a) == '#') {
                    p[b] = p[b] * -1;
                    a += 1;
                }
            }

            b += 1;
        }

        for(int i=0; i<p.length; i++) {
            answer = answer + p[i];
        }

        return answer;
    }
}