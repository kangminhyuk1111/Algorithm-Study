import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> completedRunners = new HashMap<>();

        for (String c : completion) {
            completedRunners.put(c, completedRunners.getOrDefault(c, 0) + 1);
        }

        for (String p : participant) {
            boolean isCompletedRunner = completedRunners.getOrDefault(p, 0) > 0;

            if(isCompletedRunner) {
                completedRunners.put(p, completedRunners.get(p) - 1);
            } else {
                answer = p;
                break;
            }
        }

        return answer;
    }
}