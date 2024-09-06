class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int a = query[0];
            int b = query[1];  
            int see = arr[a];
            arr[a] = arr[b];
            arr[b] = see;
        }
        return arr;
    }
}