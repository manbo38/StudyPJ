class Solution {
    public int solution(int a, int b) {
        int answer = 2 * a * b;
        int answer2 = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        
        if(answer > answer2){
            return answer;
        }else if (answer < answer2){
            return answer2;
        }else{
            return answer;
        }
    
    }
}