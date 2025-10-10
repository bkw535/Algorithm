import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        int[][] giftlist = new int[n][n];        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++) {
            map.put(friends[i], i);
        }
        
        for(int i=0; i<gifts.length; i++) {
            StringTokenizer st = new StringTokenizer(gifts[i]);
            int x = map.get(st.nextToken());
            int y = map.get(st.nextToken());
            
            giftlist[x][y]++;
        }
        
        int[] index = new int[n];
        for(int i=0; i<n; i++) {
            int give = 0;
            int receive = 0;
            
            for(int j=0; j<n; j++) {
                give += giftlist[i][j];
                receive += giftlist[j][i];
            }
            
            index[i] = give - receive;
        }
        
        int[] nextgift = new int[n];
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                int x = giftlist[i][j];
                int y = giftlist[j][i];
                
                if(x>y) {
                    nextgift[i]++;
                } else if(y>x) {
                    nextgift[j]++;
                } else {
                    if(index[i]>index[j]) {
                        nextgift[i]++;
                    } else if(index[j]>index[i]) {
                        nextgift[j]++;
                    }
                }
            }
        }
        
        int result = 0;
        for(int i : nextgift) {
            if(i> result) result = i;
        }
        
        return result;
    }
}