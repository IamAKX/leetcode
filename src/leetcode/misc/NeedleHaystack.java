package leetcode.misc;

public class NeedleHaystack {

	public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "but";
		new NeedleHaystack().strStr(haystack, needle);
	}
	
    public int strStr(String haystack, String needle) {
        int index= haystack.indexOf(needle);
        System.out.println(index);
        return index;
    }
}
