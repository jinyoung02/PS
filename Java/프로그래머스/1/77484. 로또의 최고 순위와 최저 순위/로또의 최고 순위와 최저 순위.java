class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zero = 0;

        // 0을 제외하고 맞은 번호 개수
        for(int i=0; i<lottos.length; i++) {
            int num = lottos[i];

            if(num != 0) {
                for(int j=0; j<win_nums.length; j++) {
                    if(num == win_nums[j]) {
                        count += 1;
                    }
                }
            }
            else {
                zero += 1;
            }
        }

        int k = count + zero;

        if(k == 6) {
            answer[0] = 1;
        }
        else if(k == 5) {
            answer[0] = 2;
        }
        else if(k == 4) {
            answer[0] = 3;
        }
        else if(k == 3) {
            answer[0] = 4;
        }
        else if(k == 2) {
            answer[0] = 5;
        }
        else {
            answer[0] = 6;
        }

        if(count == 6) {
            answer[1] = 1;
        }
        else if(count == 5) {
            answer[1] = 2;
        }
        else if(count == 4) {
            answer[1] = 3;
        }
        else if(count == 3) {
            answer[1] = 4;
        }
        else if(count == 2) {
            answer[1] = 5;
        }
        else {
            answer[1] = 6;
        }

        return answer;
    }
}