package problem;

import java.util.ArrayList;
import java.util.List;

public class P448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int[] result = new int[nums.length + 1];
        for(int num : nums) {
            result[num] = 1;
        }
        for(int i = 1; i< result.length; i++) {
            if (result[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
