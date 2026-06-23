class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        boolean[] used = new boolean[numlist.length];

        for (int i = 0; i < numlist.length; i++) {
            // 이번 자리에 넣을 가장 알맞은 숫자의 위치
            int bestIndex = -1;

            for (int j = 0; j < numlist.length; j++) {
                // 이미 answer에 넣은 숫자는 건너뜀
                if (used[j]) {
                    continue;
                }

                if (bestIndex == -1) {
                    bestIndex = j;
                } else {
                    int bestDiff = Math.abs(numlist[bestIndex] - n);
                    int nowDiff = Math.abs(numlist[j] - n);

                    // 거리가 더 가깝거나, 거리가 같고 숫자가 더 크면 선택
                    if (nowDiff < bestDiff) {
                        bestIndex = j;
                    } else if (nowDiff == bestDiff && numlist[j] > numlist[bestIndex]) {
                        bestIndex = j;
                    }
                }
            }
            answer[i] = numlist[bestIndex];
            used[bestIndex] = true;
        }
        return answer;
    }
}