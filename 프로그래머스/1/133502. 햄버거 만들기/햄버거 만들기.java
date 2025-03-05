import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> stack = new ArrayList<>();
        
        for (int num : ingredient) {
            stack.add(num);
            
            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size - 4) == 1 && 
                   stack.get(size - 3) == 2 && 
                   stack.get(size - 2) == 3 && 
                   stack.get(size - 1) == 1) {
                    for (int i = 0; i < 4; i++) {
                        stack.remove(stack.size() - 1);
                    }
                    answer++;
                }
            }
        }
        return answer;
    }
}