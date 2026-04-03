import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }
        
        for(String s : callings) {
            int cur = map.get(s);
            int curFront = cur - 1;
            
            String front = players[curFront];
            
            players[cur] = front;
            players[curFront] = s;
            
            map.put(s, curFront);
            map.put(front, cur);
        }
        
        return players;
    }
}