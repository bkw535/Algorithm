import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n];
        Arrays.fill(student, 1);
        
        for(int i=0; i<lost.length; i++) {
            int m = lost[i];
            student[m-1] = 0;
        }
        
        for(int i=0; i<reserve.length; i++) {
            int m = reserve[i];
            if(student[m-1] == 0) { // 잃어버렸으나 여분이 있는 경우
                student[m-1] = 1;
            } else {
                student[m-1] = 2;
            }
        }
        
        for(int i=0; i<n; i++) {
            // 여분을 가지고 있는 경우
            if(student[i] == 2) {
                // 첫 번째 학생
                if(i==0) {
                    if(student[1] == 0) {
                        student[1] = 1;
                        student[0] = 1;
                    }
                } else if(i==n-1) { // 마지막 학생
                    if(student[i-1] == 0) {
                        student[i-1] = 1;
                        student[i] = 1;
                    }
                } else { // 중간
                    // 앞에 있는 사람이 없는 경우
                    if(student[i-1] == 0) {
                        student[i-1] = 1;
                        student[i] = 1;
                    } else if(student[i+1] == 0) { // 뒷사람이 없는 경우
                        student[i+1] = 1;
                        student[i] = 1;
                    }
                }
            }
        }
        
        int count = 0;
        for(int i : student) {
            if(i>=1) count++;
        }
        
        return count;
    }
}