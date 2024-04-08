import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> answerList = new ArrayList<>();
        for (int number : numbers) {
            answerList.add(number * 2);
        }

        // ArrayList를 int[] 배열로 변환
        int[] answerArray = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answerArray[i] = answerList.get(i);
        }

        return answerArray;
    }
}