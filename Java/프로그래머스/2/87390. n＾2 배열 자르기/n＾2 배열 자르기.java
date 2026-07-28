class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];

        int index = 0;

        for(long i=left; i<=right; i++) {
            long row = i / n;
            long col = i % n;

            int k = (int)(Math.max(row, col) + 1);

            answer[index] = k;
            index = index + 1;
        }

        return answer;
    }
}