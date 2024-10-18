class Solution {
    public int[] solution(int[] num_list) {
        
        int jjak = 0;
        int hole = 0;
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0){
                jjak++;
            }else{
                hole++;
            }
        }      
        int[] answer = {jjak,hole};
        return answer;
    }
}