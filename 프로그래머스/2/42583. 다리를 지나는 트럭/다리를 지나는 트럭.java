import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        int bridgeWeight = 0;
        int idx = 0;

        for (int i = 0; i < bridge_length; i++) {
            queue.offer(0);
        }

        while(!queue.isEmpty()){
            answer++;

            bridgeWeight -= queue.poll();

            if(idx < truck_weights.length){
                if(bridgeWeight + truck_weights[idx] <= weight){
                    queue.offer(truck_weights[idx]);
                    bridgeWeight += truck_weights[idx];
                    idx++;
                } else{
                    queue.offer(0);
                }
            }
        }

        return answer;
    }
}