package leetcode.string;

public class Palindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        isPalindrome(s);

    }

    private static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if((c>='a' && c<='z') || (c>='0' && c<='9')) {
                str += c;
            }
        }
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i))
                return false;

        }
        return true;
    }
}
