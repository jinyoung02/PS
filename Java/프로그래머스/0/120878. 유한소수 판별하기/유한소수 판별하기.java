class Solution {
    public int solution(int a, int b) {
        int k = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                k = i;
            }
        }

        a = a / k;
        b = b / k;

        while (b % 2 == 0) {
            b = b / 2;
        }

        while (b % 5 == 0) {
            b = b / 5;
        }

        if (b == 1) {
            return 1;
        } else {
            return 2;
        }
    }
}