package leetcode.array;

public class RotateArray {
    static int nums[] = {1,2,3,4,5,6,7};
    static int k = 2;
    public static void main(String[] args) {


         rotate(nums,k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"\t");
        }


    }
    private static void rotate(int[] nums, int k) {
      reverseArray(nums, 0 , nums.length-1);
        reverseArray(nums, 0 , k-1);
        reverseArray(nums, k , nums.length-1);


    }

    private static void reverseArray(int[] nums, int start, int end) {
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
