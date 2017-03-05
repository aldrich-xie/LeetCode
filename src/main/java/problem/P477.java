package problem;

public class P477 {
    public int totalHammingDistance(int[] nums) {
        int total = 0;
        int[] bitNum = new int[32];
        for(int num : nums) {
            for(int j=0; j < 31; j++) {
                bitNum[j] = bitNum[j] + (1 & num);
                num = num >> 1;
            }
        }
        for (int num : bitNum) {
            total += num * (nums.length - num);
        }
        return total;
    }
}
