class Solution {
    public String solution(String my_string) {
        
        StringBuffer s = new StringBuffer(my_string);
        String answer = s.reverse().toString();
        
        return answer;
    }
}