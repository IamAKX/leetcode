package leetcode.array;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 3, 12};
        displayArray(nums);
        moveZeroes(nums);
        displayArray(nums);

    }

    private static void moveZeroes(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0) // if the current element is not 0, retain same value, move to next 
                nums[count++] = nums[i];

        while (count < nums.length)
            nums[count++] = 0;
    }

    private static void displayArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");

        }
        System.out.println();
    }
}
