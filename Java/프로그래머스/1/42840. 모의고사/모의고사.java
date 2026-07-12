class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int ac = 0;
        int bc = 0;
        int cc = 0;

        for(int i=0; i<answers.length; i++) {
            if(answers[i] == a[i % a.length]) {
                ac = ac + 1;
            }

            if(answers[i] == b[i % b.length]) {
                bc = bc + 1;
            }

            if(answers[i] == c[i % c.length]) {
                cc = cc + 1;
            }
        }

        // 가장 높은 점수 찾기
        int max = ac;

        if(bc > max) {
            max = bc;
        }

        if(cc > max) {
            max = cc;
        }

        int count = 0;

        // 최고 점수를 받은 사람 수 세기
        if(ac == max) {
            count = count + 1;
        }

        if(bc == max) {
            count = count + 1;
        }

        if(cc == max) {
            count = count + 1;
        }

        int[] answer = new int[count];
        int index = 0;

        // 최고 점수를 받은 사람 번호 넣기
        if(ac == max) {
            answer[index] = 1;
            index = index + 1;
        }

        if(bc == max) {
            answer[index] = 2;
            index = index + 1;
        }

        if(cc == max) {
            answer[index] = 3;
            index = index + 1;
        }

        return answer;
    }
}