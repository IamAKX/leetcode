package leetcode.misc;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums = {3,4,5,5,6,8,9,9,9,10,11,15,15};
		removeDuplicates(nums);
	}
	
	private static void removeDuplicates(int[] nums)
	{
		int n = nums.length;
//		 if (n == 0 || n == 1)
	      
		 int[] ar = new int[n];
		 int j=0;
		 for (int i = 0; i < n-1; i++) {
			if(nums[i] != nums[i+1])
			{
				ar[j] = nums[i];
				j++;
			}
		}
		 ar[j] = nums[n-1];
		 j++;
		 
	for (int x=0; x<j; x++)
	{
		System.out.print(ar[x]+"\t");
	}
	}
}
