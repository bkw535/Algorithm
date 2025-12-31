import java.util.*;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        Map<String, String> parent = new HashMap<>();
        Map<String, Integer> profit = new HashMap<>();
        
        
        for(int i=0; i<enroll.length; i++) {
            if(referral[i].equals("-")) {
                parent.put(enroll[i], "center");
            } else {
                parent.put(enroll[i], referral[i]);    
            }
            profit.put(enroll[i], 0);
        }
        profit.put("center", 0);
        
        for(int i=0; i<seller.length; i++) {
            String sell = seller[i];
            int money = amount[i] * 100;
            
            while(!sell.equals("center") && money > 0) {
                int give = money / 10;
                int keep = money - give;
                
                profit.put(sell, profit.get(sell) + keep);

                sell = parent.get(sell);
                money = give;
            }
            profit.put("center", profit.get("center") + money);
        }
        
        int[] answer = new int[enroll.length];
        for (int i = 0; i < enroll.length; i++) {
            answer[i] = profit.get(enroll[i]);
        }

        return answer;
    }
}