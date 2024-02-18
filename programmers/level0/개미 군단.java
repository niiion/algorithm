class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        //장군개미5, 병정개미3, 일개미1
        answer += (hp/5);
        hp %= 5;
        
        answer += (hp/3);
        hp %= 3;
        
        answer += (hp/1);
         
        return answer;
    }
}