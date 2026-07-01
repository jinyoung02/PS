class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int p = 0;

        while (n >= a) {
            p = (n / a) * b;

            answer = answer + p;

            n = (n % a) + p;
        }

        return answer;
    }
}