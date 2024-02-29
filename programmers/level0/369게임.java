class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String s = Integer.toString(order);
        String[] number = s.split("");    
            
        for(int i = 0; i < number.length; i++) {
            if(number[i].equals("3") || number[i].equals("6") || number[i].equals("9")){
                answer++;
            }
        }
            
        return answer;
    }
}