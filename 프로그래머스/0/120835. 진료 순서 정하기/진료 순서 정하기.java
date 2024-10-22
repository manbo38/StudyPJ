import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        
        int[] result = new int[n];
        
        List<Integer> list = new ArrayList<>();
        for (int i : emergency) {
            list.add(i);
        }
        
        int[] sssEmergency = Arrays.copyOf(emergency, n);
        Arrays.sort(sssEmergency);
        
        int count = 1;
        

        for (int i=n-1; i>=0; i--) {
            int target = sssEmergency[i];
            
            result[list.indexOf(target)] = count++;
        }
        
        return result;
    }
}
