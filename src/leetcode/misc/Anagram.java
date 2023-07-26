package leetcode.misc;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "anagram";
		String str2 = "nagaram";
		boolean isAnagram = checkAnagram(str1, str2);	
		System.out.println(isAnagram);
	}

	private static boolean checkAnagram(String str1, String str2) {
		// TODO Auto-generated method stub
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : str1.toCharArray())
		{
			int freq = (map.containsKey(c))? map.get(c)+1 : 1;
			map.put(c, freq);
		}
		for(char c : str2.toCharArray())
		{
			int freq;
			if(map.containsKey(c))
			{
				freq = map.get(c)-1;
				if(freq == 0)
					map.remove(c);
				else
				map.put(c, freq);
			}
			else
				return false;			
		}		
		return map.isEmpty();
		
	}
}
