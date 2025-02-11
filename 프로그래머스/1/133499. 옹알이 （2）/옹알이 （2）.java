class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] pronunciation = {"aya", "ye", "woo", "ma"};
        
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < pronunciation.length; j++) {
                if (babbling[i].contains(pronunciation[j] + pronunciation[j])) {
                    break;
                }
                babbling[i] = babbling[i].replace(pronunciation[j], " ");
            }
            if (babbling[i].trim().isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}