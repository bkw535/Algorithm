class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] st = new int[n];
        
        for(int i : lost) {
            st[i-1]++;
        }
        
        for(int i : reserve) {
            st[i-1]--;
        }
        
        for(int i=0; i<n; i++) {
            if(st[i] == -1) {
                if(i > 0 && st[i-1] == 1) {
                    st[i]++;
                    st[i-1]--;
                } else if(i < n-1 && st[i+1] == 1) {
                    st[i]++;
                    st[i+1]--;
                }
            }
        }
        
        int answer = 0;
        
        for(int i : st) {
            if(i <= 0) answer++;
        }
        
        return answer;
    }
}