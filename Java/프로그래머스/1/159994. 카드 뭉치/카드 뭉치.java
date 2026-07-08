class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int a = 0;
        int b = 0;

        for(int i=0; i<goal.length; i++) {
            if(a < cards1.length && goal[i].equals(cards1[a])) {
                a = a + 1;
            } else if(b < cards2.length && goal[i].equals(cards2[b])) {
                b = b + 1;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}