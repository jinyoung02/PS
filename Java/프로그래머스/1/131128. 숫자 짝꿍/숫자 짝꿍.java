class Solution {
    public String solution(String X, String Y) {
        String answer = "";

        int[] x = new int[10];
        int[] y = new int[10];

        for(int i=0; i<X.length(); i++) {
            int num = X.charAt(i) - '0';
            x[num] += 1;
        }

        for(int i=0; i<Y.length(); i++) {
            int num = Y.charAt(i) - '0';
            y[num] += 1;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=9; i>=0; i--) {
            int count = Math.min(x[i], y[i]);

            for(int j=0; j<count; j++) {
                sb.append(i);
            }
        }

        if(sb.length() == 0) {
            return "-1";
        }

        if(sb.charAt(0) == '0') {
            return "0";
        }

        answer = sb.toString();

        return answer;
    }
}