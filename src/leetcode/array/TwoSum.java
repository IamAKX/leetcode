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

        HashSet<Integer> set = new HashSet<>();
        for (int n :
                nums) {
            set.add(n);
        }
        for(int n : set){
            int m = target - n;
            if(set.contains(m)){
                return new int[]{n,m};
            }
        }


        return new int[]{};
    }
}
