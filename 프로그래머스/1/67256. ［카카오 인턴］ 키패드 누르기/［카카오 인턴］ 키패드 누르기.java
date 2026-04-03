import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String s = "";
        Map<Integer, int[]> map = new HashMap<>();
        
        for(int i=1; i<=9; i++) {
            map.put(i, new int[]{(i-1)/3, (i-1)%3});
        }
        
        map.put(-1, new int[]{3,0});
        map.put(0, new int[]{3,1});
        map.put(-2, new int[]{3,2});
        
        int curL = -1;
        int curR = -2;
        for(int i=0; i<numbers.length; i++) {
            int num = numbers[i];
            if(num == 1 || num == 4 || num == 7) {
                s+="L";
                curL = num;
            }
            if(num == 3 || num == 6 || num == 9) {
                s+="R";
                curR = num;
            }
            if(num == 2 || num == 5 || num == 8 || num == 0) {
                int[] left = map.get(curL);
                int[] right = map.get(curR);
                int[] now = map.get(num);
                
                int disL = Math.abs(left[0] - now[0]) + Math.abs(left[1] - now[1]);
                int disR = Math.abs(right[0] - now[0]) + Math.abs(right[1] - now[1]);
                
                if(disL < disR) {
                    s+="L";
                    curL = num;
                } else if(disL > disR) {
                    s+="R";
                    curR = num;
                } else {
                    if(hand.equals("right")) {
                        s+="R";
                        curR = num;
                    } else {
                        s+="L";
                        curL = num;
                    }
                }
            }
            
        }
        return s;
    }
}