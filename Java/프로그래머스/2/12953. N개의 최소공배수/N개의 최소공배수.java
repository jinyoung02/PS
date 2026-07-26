class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];

        for(int i=1; i<arr.length; i++) {
            int a = answer;
            int b = arr[i];

            int x = a;
            int y = b;

            while(y != 0) {
                int r = x % y;
                x = y;
                y = r;
            }

            int gcd = x;

            answer = a * b / gcd;
        }

        return answer;
    }
}