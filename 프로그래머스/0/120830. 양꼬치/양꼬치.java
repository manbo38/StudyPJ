class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int a = 12000;
        int b = 2000;
    
        
        answer = (a*n) + (b*k) - (n/10*b);
        
        
        return answer;
    }
}