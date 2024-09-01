public class Solution {
    public int solution(int[] num_list) {
        
        StringBuilder sb = new StringBuilder();
        StringBuilder st = new StringBuilder();
        
       
        for (int num : num_list) {
            if (num % 2 == 0) {
                st.append(num);
            } else {
                sb.append(num);
            }
        }
        
        int sbNumber = Integer.parseInt(sb.toString());
        int stNumber = Integer.parseInt(st.toString());
        
        return sbNumber + stNumber;
    }
}
