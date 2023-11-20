import java.util.*;
class Solution {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x; //배열의 첫 번째 요소에 초기값을 설정하는 부분
//answer[0] 에 x를 할당하는 이유는 등차수열의 첫항을 배열의 첫 번째 요소로 설정하기 위함.
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;

    }
}


// 예를 들어, x가 2이고 배열의 길이 n이 5일 경우를 생각해보면:

// answer[0] = x;를 통해 배열의 첫 번째 요소는 2가 됩니다.
// 그 다음 반복문에서 answer[i] = answer[i - 1] + x;를 통해 각 요소를 생성하면, 두 번째 요소부터는 이전 요소에 2를 더한 값이 됩니다.
// answer[1] = answer[0] + x; → answer[1] = 2 + 2 = 4
// answer[2] = answer[1] + x; → answer[2] = 4 + 2 = 6
// answer[3] = answer[2] + x; → answer[3] = 6 + 2 = 8
// answer[4] = answer[3] + x; → answer[4] = 8 + 2 = 10
