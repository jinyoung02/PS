import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> sums = new HashSet<>();
        int n = elements.length;

        for (int start = 0; start < n; start++) {
            int sum = 0;

            for (int length = 0; length < n; length++) {
                int index = (start + length) % n;

                sum = sum + elements[index];

                sums.add(sum);
            }
        }

        // 중복 제외
        return sums.size();
    }
}