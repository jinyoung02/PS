class Solution {
    public int solution(int[] common) {
        
        int n = common.length;
        int diff1 = common[1] - common[0];
        int diff2 = common[2] - common[1];
        
        if (diff1 == diff2) {
            return common[n - 1] + diff1;
        } else {
            int r = common[1] / common[0];
            return common[n - 1] * r;
        }
    }
}