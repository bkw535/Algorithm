class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        int index = prices.length;

        for(int i = 0; i < prices.length - 1; i++){
            for(int j = i+1; j < index; j++){
                if(prices[i] > prices[j]){
                    answer[i]++;
                    break;
                } else {
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}