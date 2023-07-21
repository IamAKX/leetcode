package leetcode.string;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
      String s = "anagram", t = "nagaram";
      boolean res =  isAnagram( s,  t);
      System.out.println(res);
    }

    private static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        int MAX_CHAR = 256;
        int[] charCount1 = new int[MAX_CHAR];
        int[] charCount2 = new int[MAX_CHAR];
        Arrays.fill(charCount1,0);
        Arrays.fill(charCount2,0);

        for (int i = 0; i < s.length(); i++) {
            charCount1[s.charAt(i)]++;
            charCount2[t.charAt(i)]++;
        }

        for (int i = 0; i < MAX_CHAR; i++) {
            if(charCount1[i] != charCount2[i])
                return false;
        }


        return true;
    }
}
