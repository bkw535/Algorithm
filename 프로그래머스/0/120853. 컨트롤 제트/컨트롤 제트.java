import java.util.*;

class Solution {
    public int solution(String s) {
        String[] cmd = s.split(" ");
        
        Stack<String> stack = new Stack<>();
        int total = 0;
        for(int i=0; i<cmd.length; i++) {
            if(cmd[i].equals("Z")) {
                total -= Integer.parseInt(cmd[i-1]);
            } else {
                total += Integer.parseInt(cmd[i]);
            }
        }
        
        return total;
    }
}