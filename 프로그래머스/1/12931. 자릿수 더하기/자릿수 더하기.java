import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 주어진 수 n이 0보다 클 동안 반복
        while (n > 0) {
        // n을 10으로 나눈 나머지를 answer에 더함
            answer += n % 10;
        // n을 10으로 나눈 몫으로 업데이트
            n /= 10;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");

        return answer;
    }
}