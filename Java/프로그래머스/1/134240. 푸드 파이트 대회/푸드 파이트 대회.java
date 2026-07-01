class Solution {
    public String solution(int[] food) {
        String s = "";
        String r = "";
        int k = 0;

        for (int i = 1; i < food.length; i++) {
            k = food[i] / 2;

            for (int j = 0; j < k; j++) {
                s = s + i;
            }
        }

        for (int a = s.length() - 1; a >= 0; a--) {
            r = r + s.charAt(a);
        }

        return s + "0" + r;
    }
}