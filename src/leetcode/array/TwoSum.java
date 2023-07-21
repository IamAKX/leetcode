package leetcode.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = twoSum(nums, target);
        System.out.println(res[0] + " " + res[1]);
    }

    private static int[] twoSum(int[] nums, int target) {

        List<Integer> set = new ArrayList<>();
        for (int n :
                nums) {
            set.add(n);
        }
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(target - nums[i])) {
                if (i != set.indexOf(target - nums[i]))
                    return new int[]{i, set.indexOf(target - nums[i])};

            }
        }
        return new int[]{};
    }
}
