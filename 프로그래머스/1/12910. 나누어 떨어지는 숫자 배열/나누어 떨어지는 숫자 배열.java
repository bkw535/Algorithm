import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            int n = arr[i];
            if(n%divisor == 0) {
                stack.push(n);
            }
        }
        
        if(stack.isEmpty()) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        int[] answer = new int[stack.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = stack.pop();
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}