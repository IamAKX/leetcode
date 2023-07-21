package leetcode.array;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,3,3,4,4,5,5,6,6,6,7,7};
        int n = removeDuplicates(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]+"\t");
        }
    }

    private static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1)
            return n;
        int[] ar = new int[n];
        int j = 0;
        for (int i = 0; i < n-1; i++) {
            if(nums[i] != nums[i+1])
            {
                ar[j] = nums[i];
                j++;
            }
        }

        ar[j] = nums[n-1];
        j++;

        for (int i = 0; i < j; i++) {
            nums[i] = ar[i];
        }

        return j;
    }
}
