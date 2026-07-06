class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = strings;

        for(int i=0; i<answer.length; i++) {
            for(int j=i+1; j<answer.length; j++) {
                if(answer[i].charAt(n) > answer[j].charAt(n)) {
                    String temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                } else if(answer[i].charAt(n) == answer[j].charAt(n)) {
                    if(answer[i].compareTo(answer[j]) > 0) {
                        String temp = answer[i];
                        answer[i] = answer[j];
                        answer[j] = temp;
                    }
                }
            }
        }

        return answer;
    }
}