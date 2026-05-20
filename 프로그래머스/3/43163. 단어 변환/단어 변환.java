import java.util.*;

class Word {
    String word;
    int count;
    
    Word(String word, int count) {
        this.word = word;
        this.count = count;
    }
}

class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        
        return bfs(begin, target, words, visited);
}
    
    public int bfs(String begin, String target, String[] words, boolean[] visited) {
        Deque<Word> deque = new ArrayDeque<>();
        deque.offer(new Word(begin, 0));
        
        while(!deque.isEmpty()) {
            Word cur = deque.poll();
            String now = cur.word;
            int cnt = cur.count;
            
            if(now.equals(target)) return cnt;
            
            for(int i=0; i<words.length; i++) {
                if(!visited[i] && changeWords(now, words[i])) {
                    visited[i] = true;
                    deque.offer(new Word(words[i], cnt+1));
                }
            }
        }
        
        return 0;
    }
    
    public boolean changeWords(String begin, String after) {
        int len = begin.length();
        
        for(int i=0; i<begin.length(); i++) {
            if(begin.charAt(i) == after.charAt(i)) len--;
        }
        
        if(len == 1) return true;
        
        return false;
    }
}