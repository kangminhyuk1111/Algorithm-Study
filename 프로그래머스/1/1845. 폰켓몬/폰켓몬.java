import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        
        Map<Integer, Integer> pokemons = new HashMap();
        
        for(int num: nums) {
            pokemons.put(num, pokemons.getOrDefault(num, 0) + 1);
        }
        
        return Math.min(pokemons.size(), max);
    }
}