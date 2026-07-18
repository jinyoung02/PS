class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for(int i=0; i<targets.length; i++) {
            int count = 0; // 누르는 횟수
            boolean possible = true;

            for(int j=0; j<targets[i].length(); j++) {
                char x = targets[i].charAt(j);

                int min = 101; // 최소 누름 횟수

                for(int a=0; a<keymap.length; a++) {
                    for(int b=0; b<keymap[a].length(); b++) {
                        if(keymap[a].charAt(b) == x) {
                            if(b + 1 < min) {
                                min = b + 1;
                            }
                        }
                    }
                }

                if(min == 101) {
                    possible = false;
                    break;
                }
                else {
                    count = count + min;
                }
            }

            if(possible == true) {
                answer[i] = count;
            }
            else {
                answer[i] = -1;
            }
        }

        return answer;
    }
}