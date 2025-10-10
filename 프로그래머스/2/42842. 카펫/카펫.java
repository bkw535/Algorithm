class Solution {
    public int[] solution(int brown, int yellow) {
        int w = brown/2+2;
        int h = 0;
        
        while(w*h != brown+yellow){
            w--;
            h++;
        }
        int[] answer = {w, h};
        return answer;
    }
}