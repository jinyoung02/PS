class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int p = brown + yellow;

        for(int i=1; i<=p; i++) {
            int k = 0;

            if(p % i == 0) {
                k = p / i;

                int a = i - 2;
                int b = k - 2;

                if(a * b == yellow) {
                    if(i >= k) {
                        answer[0] = i;
                        answer[1] = k;
                    }
                    else {
                        answer[0] = k;
                        answer[1] = i;
                    }
                }
            }
        }

        return answer;
    }
}