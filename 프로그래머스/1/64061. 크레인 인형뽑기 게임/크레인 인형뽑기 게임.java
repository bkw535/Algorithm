import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        
        int answer = 0;
        for(int i : moves) {
            int cur = 0;
            int idx = i-1;
            
            for(int j=0; j<board.length; j++) {
                if(board[j][idx] != 0) {
                    cur = board[j][idx];
                    board[j][idx] = 0;
                    break;
                }
            }
            
            if(cur == 0) continue;
            
            if(stack.isEmpty()) {
                stack.push(cur);
            } else {
                if(cur == stack.peek()) {
                    stack.pop();
                    answer+=2;
                } else {
                    stack.push(cur);
                }
            }
        }
        
        return answer;
    }
}