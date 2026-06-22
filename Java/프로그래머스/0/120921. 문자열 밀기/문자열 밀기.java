class Solution {
    public int solution(String A, String B) {
        char[] a = A.toCharArray();

        for (int count = 0; count < A.length(); count++) {
            String now = new String(a);

            if (now.equals(B)) {
                return count;
            }

            char last = a[a.length - 1];

            for (int i = a.length - 1; i > 0; i--) {
                a[i] = a[i - 1];
            }

            a[0] = last;
        }

        return -1;
    }
}