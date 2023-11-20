class Solution {
    public int solution(int n) {
        int answer = 0;
         
         // 약수 해당숫자를 나머지없이 딱나누어 떨어지게하는것.
         // 1부터 n까지 숫자 중 n의 약수인지 확인하여 약수라면 answer에 더함
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        
        return answer;
    }
}