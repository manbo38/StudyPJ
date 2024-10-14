import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : num_list){
            list.add(i);
        }
      
        Collections.reverse(list);
        
        System.out.println(list);
        
        answer = list.stream().mapToInt(i -> i).toArray();   

        return answer;
    }
}