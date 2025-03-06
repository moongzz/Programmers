class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder(s.length());
        s += ".";
        String[] splits = s.split(" ");
        for (String split : splits) {
            for (int i = 0; i < split.length(); i++) {
                char c = split.charAt(i);
                if (i % 2 == 0) {
                    answer.append(Character.toUpperCase(c));
                } else {
                    answer.append(Character.toLowerCase(c));
                }
            }
            answer.append(' ');
        }
        answer.setLength(answer.length() - 2);
        return answer.toString();
    }
}