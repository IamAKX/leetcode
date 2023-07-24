package interview;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = {"flower","flow","flowight"};
		System.out.println(longestCommonPrefix(strs));
	}
    public static String longestCommonPrefix(String[] strs) {
        int L = 0;
        for(int i=0;i<strs[0].length();i++){
            int ok = 1;
            for(int j=0;j<strs.length;j++){
                if(L>=strs[j].length() || strs[j].charAt(L)!=strs[0].charAt(L)){
                    ok = 0;
                    break;
                }
            }
            if(ok==1){
                L++;
            }
            else{
                break;
            }
        }
        return strs[0].substring(0,L);
    }
}
