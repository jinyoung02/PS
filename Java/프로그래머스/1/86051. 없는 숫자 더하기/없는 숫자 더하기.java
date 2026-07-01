class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 45;
        int k = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            k = k + numbers[i];
        }
        
        if (k != sum) {
            answer = sum - k;
        }
        return answer;
    }
}