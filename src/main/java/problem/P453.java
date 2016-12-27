package problem;

public class P453 {
    public int minMoves(int[] nums) {
        int moves = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            moves += num;
        }
        return moves - nums.length * min;
    }
}
