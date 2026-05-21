class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] stu = new int[n];
        
        for(int i=0; i<n; i++) {
            stu[i] = 1;
        }
        
        // 체육복 도난
        for(int i : lost) {
            stu[i-1]-=1;
        }
        
        // 여분 체육복
        for(int i : reserve) {
            stu[i-1]+=1;
        }
        
        // 체육복 빌려줌
        for(int i=0; i<n; i++) {
            if(stu[i] == 0) {
                if(i-1>=0 && stu[i-1] > 1) {
                    stu[i-1]--;
                    stu[i]++;
                } else if(i+1<n && stu[i+1] > 1) {
                    stu[i+1]--;
                    stu[i]++;
                }   
            }
        }
        
        // 체육복 소유 총 학생 수
        int answer = 0;
        for(int i : stu) {
            if(i >=1) {
                answer++;
            }
        }
        
        return answer;
    }
}