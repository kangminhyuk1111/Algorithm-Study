import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> clothesCount = new HashMap<>();
        
        for (String[] cloth : clothes) {
            String clothType = cloth[1];
            clothesCount.put(clothType, clothesCount.getOrDefault(clothType, 0) + 1);
        }
        
        int result = 1;
        for (int count : clothesCount.values()) {
            result *= (count + 1);
        }
        
        return result - 1;
    }
}