class Solution {
    public String solution(String phoneNumber) {
        String answer = "";
        
        for(int i = 0; i < phoneNumber.length(); i++) {
            if(i < phoneNumber.length() - 4)
                answer += "*";
            else
                answer += phoneNumber.charAt(i);
        }
        return answer;
    }
}