import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        return Arrays.stream(nums)
            .boxed()
            .collect(Collectors.collectingAndThen(Collectors.toSet(),
            pokemons -> Integer.min(pokemons.size(), nums.length / 2)));
    }
}