class Solution {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) {
            return false;
        }
        
        String a = s.toLowerCase();
        a = a.replaceAll("[a-z]","");
        if(s.length() != a.length()) {
            return false;
        }
            
        return true;
    }
}