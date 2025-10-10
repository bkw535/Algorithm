import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        
        int m = nums.length/2;
        
        int answer = Math.min(m, set.size());
        return answer;
    }
}