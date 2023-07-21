package leetcode.string;

import java.util.HashSet;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "aabb";
        int index = firstUniqChar(s);
        System.out.println(index);

    }

    private static int firstUniqChar(String s) {

        for (char c : s.toCharArray()) {

            if(s.indexOf(c) == s.lastIndexOf(c))
                return s.indexOf(c);
        }
        return -1;
    }
}
