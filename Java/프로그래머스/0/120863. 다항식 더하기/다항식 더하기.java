class Solution {
    public String solution(String polynomial) {
        String[] arr = polynomial.split(" \\+ ");

        int xSum = 0;
        int numSum = 0;

        for (int i = 0; i < arr.length; i++) {
            String term = arr[i];

            if (term.contains("x")) {
                String num = term.replace("x", "");

                if (num.equals("")) {
                    xSum = xSum + 1;
                } else {
                    xSum = xSum + Integer.parseInt(num);
                }
            } else {
                numSum = numSum + Integer.parseInt(term);
            }
        }

        if (xSum == 0) {
            return String.valueOf(numSum);
        }

        String answer;
        
        if (xSum == 1) {
            answer = "x";
        } else {
            answer = xSum + "x";
        }

        if (numSum > 0) {
            answer = answer + " + " + numSum;
        }
        return answer;
    }
}