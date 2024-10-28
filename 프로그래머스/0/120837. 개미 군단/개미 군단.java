class Solution {
    public int solution(int hp) {
        int answer = 0;
  
        int jg = 5;
        int bj = 3;
        int ig = 1;
        
        answer = (hp/jg) + (hp%jg)/bj + ((hp%jg)%bj);
        
        return answer;
    }
}