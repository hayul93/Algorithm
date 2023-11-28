import java.util.*;
 
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> divList = new ArrayList<Integer>();
        
        // 나누어 떨어지는 수 구하기
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0)
                divList.add(arr[i]);
        }
                
        // 나누어 떨어지는 수가 없는 경우
        if(divList.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        }
        
        // 나누어 떨어지는 수가 있는 경우
        else{
            answer = new int[divList.size()];
            
            // 오름차순 정렬
            Collections.sort(divList);
            
            for(int i=0; i<divList.size(); i++)
                answer[i] = divList.get(i);
        }
        return answer;
    }
}