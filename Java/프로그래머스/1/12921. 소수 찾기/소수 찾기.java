class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] prime = new boolean[n + 1];

        // 일단 2부터 n까지 전부 소수라고 표시
        for(int i=2; i<=n; i++) {
            prime[i] = true;
        }

        // 소수가 아닌 수들을 지우기
        for(int i=2; i*i<=n; i++) {
            if(prime[i] == true) {
                for(int j=i*i; j<=n; j=j+i) {
                    prime[j] = false;
                }
            }
        }

        // true로 남아있는 수가 소수
        for(int i=2; i<=n; i++) {
            if(prime[i] == true) {
                answer = answer + 1;
            }
        }

        return answer;
    }
}