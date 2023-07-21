package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] res = intersect(nums1,nums2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+"\t");

        }
    }

    private static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        int m = nums1.length;
        int n = nums2.length;
        int i=0, j=0;
        while (i<m && j<n){
            if(nums1[i] < nums2[j])
                i++;
            else if(nums1[i] > nums2[j])
                j++;
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        return  list.stream().mapToInt(Integer::intValue).toArray();
    }
}
