package leetcode.stack;

import java.util.ArrayList;
import java.util.List;

public class LongestSubsequence {

    public static void main(String[] args) {
        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";
        String lcs = longestCommonSubsequence(str1, str2);
        System.out.println(lcs);
    }

    private static String longestCommonSubsequence(String str1, String str2) {
        List<String> list1 = generateSubstring( str1);
        List<String> list2 = generateSubstring( str2);
        String longestSubSeq = "";
        for (String s1 :
                list1) {
            for (String s2 :
                    list2) {
                if (s1.equals(s2) && s1.length() > longestSubSeq.length()){
                    longestSubSeq = s1;
                }
            }

        }
        return longestSubSeq;
    }

   static List<String> generateSubstring(String str){
        List<String> subSeqList = new ArrayList<>();

                splitString(str, "", 0, subSeqList);
                return  subSeqList;
   }

    private static void splitString(String str, String s, int i, List<String> subSeqList) {
        if(i == str.length()){
            subSeqList.add(s);
            return;
        }
        splitString(str,s, i+1, subSeqList);
        splitString(str,s+str.charAt(i), i+1, subSeqList);
    }
}
