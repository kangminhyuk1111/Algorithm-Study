import java.util.*;

class Solution {
        public int solution(String[][] clothes) {
        Map<String, Integer> clothesByType = new HashMap<>();

        for(int i = 0; i < clothes.length; i++) {
            String type = clothes[i][1];
            clothesByType.put(type, clothesByType.getOrDefault(type, 0) + 1);
        }

        int result = 1;

        for (Integer value : clothesByType.values()) {
            result *= value + 1;
        }

        return result - 1;
    }
}