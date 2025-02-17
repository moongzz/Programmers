import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int index = 0;

        for (int value : score) {
            minHeap.offer(value);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
            answer[index++] = minHeap.peek();
        }
        
        return answer;
    }
}