import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i < priorities.length; i++){
            queue.add(new int[]{priorities[i], i});
        }

        while(!queue.isEmpty()){
            int[] check = queue.poll();

            boolean hasHigher = false;
            for(int[] q : queue){
                if(q[0] > check[0]){
                    hasHigher = true;
                    break;
                }
            }

            if(hasHigher){
                queue.offer(check);
            } else {
                answer++;
                if(check[1] == location){
                    return answer;
                }
            }
        }

        return answer;
    }
}