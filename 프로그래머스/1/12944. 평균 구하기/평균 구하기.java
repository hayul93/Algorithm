class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        answer += average;
        return answer;
    }
}