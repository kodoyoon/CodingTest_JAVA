class Solution {
    public int solution(int num1, int num2) {
        double answer = (double)num1 / num2 * 1000;
       return (int) answer; //뒤에 있는 . 을 없애야 하니까 형변혼!!!!!!!!!!!!!!!!!!!
    }
}