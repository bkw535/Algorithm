class Solution {
    public int solution(int[] numbers, int target) {      
        int index = 0;
        int sum = 0;
        
        return dfs(index, sum, numbers, target);
    }
    
    private int dfs(int index, int sum, int[] numbers, int target) {
        if(index == numbers.length) return sum == target ? 1: 0;
        
        return dfs(index+1, sum+numbers[index], numbers, target)
             + dfs(index+1, sum-numbers[index], numbers, target);
    }
}