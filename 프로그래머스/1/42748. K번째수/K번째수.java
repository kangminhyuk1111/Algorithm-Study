import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answers = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int temp = commands[i][2];

            final List<Integer> result = new ArrayList<>();

            for (int j = 0; j < end - start + 1; j++) {
                result.add(array[start+j-1]);
            }

            result.sort(Comparator.naturalOrder());

            answers.add(result.get(temp-1));
        }

        return answers.stream().mapToInt(i -> i).toArray();
    }
}