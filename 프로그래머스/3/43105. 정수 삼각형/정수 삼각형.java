class Solution {
    public int solution(int[][] triangle) {
        int max = 0;
        for(int i=1; i<triangle.length; i++) {
            for(int j=0; j<triangle[i].length; j++) {
                if(j==0) {
                    triangle[i][j]+=triangle[i-1][j];
                } else if(j == i) {
                    triangle[i][j]+=triangle[i-1][j-1];
                } else {
                    triangle[i][j]+=Math.max(triangle[i-1][j-1], triangle[i-1][j]);
                }
            }
        }
        
        for(int i=0; i<triangle[triangle.length-1].length; i++) {
            if(max<triangle[triangle.length-1][i]) {
                max = triangle[triangle.length-1][i];
            }
        }
        
        return max;
    }
}