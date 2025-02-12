class Solution {
    public String solution(int n) {
        String[] answer = new String[n];
        answer[0] = "수";

        for (int i = 0; i < n-1; i++) {
            answer[i+1] = "수".equals(answer[i]) ? "박" : "수";
        }

        return String.join("", answer);
    }
}