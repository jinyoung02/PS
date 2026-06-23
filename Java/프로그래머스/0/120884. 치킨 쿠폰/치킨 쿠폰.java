class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
        int answer = 0;
        int a; // 남은 쿠폰
        int b; // 새 쿠폰
        int service;

        while (coupon >= 10) {
            service = coupon / 10;
            a = coupon % 10;
            b = service;

            int k; // 다음에 사용할 쿠폰 수
            k = a + b;

            answer = answer + service;
            coupon = k;
        }
        
        return answer;
    }
}