class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stage = new int[N];
        double[] rate = new double[N];

        for(int i=1; i<=N; i++) {

            // 먼저 실패율 계산하기
            int a = 0; // 스테이지에 도달한 플레이어 수
            int b = 0; // 아직 클리어하지 못한 플레이어 수

            for(int j=0; j<stages.length; j++) {
                if(stages[j] >= i) {
                    a += 1;
                }
            }
            for(int p=0; p<stages.length; p++) {
                if(stages[p] == i) {
                    b += 1;
                }
            }

            double f;

            if(a == 0) {
                f = 0;
            }
            else {
                f = (double)b / a;
            }
            // 저장
            stage[i - 1] = i;
            rate[i - 1] = f;
        }
        
        // 정렬
        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                if(rate[i] < rate[j] || (rate[i]== rate[j] && stage[i]>stage[j])) {
                    double tempRate = rate[i];
                    rate[i] = rate[j];
                    rate[j] = tempRate;

                    int tempStage = stage[i];
                    stage[i] = stage[j];
                    stage[j] = tempStage;
                }
            }
        }
        
        return stage;
    }
}