import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] nameArr, int[] yearning, String[][] photo) {
        Map<String, Integer> match = new HashMap<>();
        int[] answer = new int[photo.length];
        
        for (int i = 0; i < nameArr.length; i++) {
            match.put(nameArr[i], yearning[i]);
        }
    
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                String person = photo[i][j];
                if (match.containsKey(person)) {
                    sum += match.get(person);
                }
            }
            answer[i] = sum;
        }
    
        return answer;
    }
}