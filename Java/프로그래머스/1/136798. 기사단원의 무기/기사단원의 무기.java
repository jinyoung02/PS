class Solution {
    public int solution(int number, int limit, int power) {
        int[] p = new int[number]; // 약수의 개수 저장
        int s = 0;
        
        for(int i=1; i<=number; i++) {
            int count = 0;
            for(int j=1; j<=i; j++) {
                if(i % j == 0) {
                    count += 1;
                }
                p[i-1] = count;
            }
        }
        
        for(int a=0; a<p.length; a++) {
            if(p[a]<=limit) {
                s = s + p[a];
            }
            else {
                s = s + power;
            }
        }
        
        return s;
    }
}