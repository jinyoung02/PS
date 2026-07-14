class Solution {
    public int solution(int n) {
        int answer = 0;

        String b = Integer.toBinaryString(n);
        int count1 = 0; // 1의 개수
        
        for(int i=0; i<b.length(); i++) {
            if(b.charAt(i) == '1') {
                count1 += 1;
            }
        }
        
        int k = n+1;
        while(true) {
            String p = Integer.toBinaryString(k);
            int count2 = 0;
            for(int i=0; i<p.length(); i++) {
                if(p.charAt(i) == '1') {
                    count2 += 1;
                }
            }
            if(count1 == count2) {
                answer = k;
                break;
            }
            
            k += 1;
        }
        return answer;
    }
}