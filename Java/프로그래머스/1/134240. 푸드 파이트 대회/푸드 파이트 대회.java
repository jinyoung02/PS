class Solution {
    public String solution(int[] food) {
        
        // StringBuilder로 문자열을 빠르게 누적
        StringBuilder left = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                left.append(i);
            }
        }

        StringBuilder answer = new StringBuilder();

        answer.append(left);
        answer.append(0);
        answer.append(new StringBuilder(left).reverse());

        return answer.toString();
    }
}