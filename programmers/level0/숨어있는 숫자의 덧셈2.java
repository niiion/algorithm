class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[^\\d]", " ");
        String[] s = my_string.split(" ");
        
        for (int i = 0; i < s.length; i++) {
            answer += (!s[i].isEmpty()) ? Integer.parseInt(s[i]) : 0;
        }
        
        return answer;
    }
}