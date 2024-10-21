class Solution {
    public String solution(int age) {
      
        String alpha = "abcdefghij";
        
        StringBuilder sb = new StringBuilder();
        
        while (age > 0) {
            sb.insert(0, alpha.charAt(age % 10));
            age /= 10;
        }
        
        return sb.toString();
    }
}