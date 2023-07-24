package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RotateArray {
	static int k=3;
	
	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7};
		rotateArray(num,k);
		for (int x=0; x<num.length; x++)
		{
			System.out.print(num[x]+"\t");
		}
	}

	private static void rotateArray(int[] num, int k) {
		// TODO Auto-generated method stub
		reverse(num, 0, num.length);
		reverse(num, 0, k);
		reverse(num, k, num.length);
	}

	private static void reverse(int[] num, int start, int end) {
		// TODO Auto-generated method stub

		while(start < end)
		{
			int temp = num[start];
			num[start] = num[end-1];
			num[end-1] = temp;
			start++;
			end--;
		}
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		
		for(Entry<Integer, Integer> entry : map.entrySet())
		{
			
		}
	}

		
	
	
}
