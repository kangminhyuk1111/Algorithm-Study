import java.util.*;

class Solution {
    public int solution(int[] array) {
        int[] newArr = Arrays.copyOf(array, array.length);
        Arrays.sort(newArr);
        return newArr[array.length/2];
    }
}