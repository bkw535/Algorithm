class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        
        for(int i=0; i<sizes.length; i++) {
            int sizeW = Math.max(sizes[i][0], sizes[i][1]);
            int sizeH = Math.min(sizes[i][0], sizes[i][1]);
            
            w = Math.max(w, sizeW);
            h = Math.max(h, sizeH);
        }
        
        return w*h;
    }
}