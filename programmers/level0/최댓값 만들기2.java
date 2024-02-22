import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int l = numbers.length;

        Arrays.sort(numbers);

        return Math.max(numbers[0] * numbers[1], numbers[l-2] * numbers[l-1]);
    }
}
