import java.util.*;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        Map<String, String> parent = new HashMap<>();
        Map<String, Integer> money = new HashMap<>();
        
        for(int i=0; i<enroll.length; i++) {
            String a = enroll[i];
            String b = referral[i];
            if(b.equals("-")) {
                b = "center";
            }
            parent.put(a, b);
            money.put(a,0);
        }
        
        for(int i=0; i<seller.length; i++) {
            String cur = seller[i];
            int curMoney = amount[i] * 100;
            
            while(!cur.equals("center") && curMoney > 0) {
                int up = curMoney/10;
                int remain = curMoney - up;
                
                money.put(cur, money.get(cur) + remain);
                cur = parent.get(cur);
                curMoney = up;
            }
        }
        
        int[] arr = new int[enroll.length];
        for(int i=0; i<enroll.length; i++) {
            arr[i] = money.get(enroll[i]);
        }
        
        return arr;
    }
}