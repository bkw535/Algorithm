class Solution {
    public int[] solution(int[] prices) {
        int[] time = new int[prices.length];
        
        for(int i=0; i<prices.length; i++) {
            int cur = prices[i];
            for(int j=i+1; j<prices.length; j++) {
                time[i]++;
                if(prices[j] < cur) {
                    break;
                }
            }
        }
        
        return time;
    }
}