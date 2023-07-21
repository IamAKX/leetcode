package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr= {1,2,3,1};
        boolean b = containsDuplicate(arr);
        System.out.print(b);
    }
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> frequency = new HashMap<Integer,Integer>();
        for (int n:
             nums) {
            if(frequency.get(n) == null){
                frequency.put(n,1);
            }
            else {
                frequency.put(n, frequency.get(n)+1);
            }
        }
        boolean res = false;
        for(Integer n : frequency.values()){
            if(n>1)
                res=true;
        }

        return  res;
    }
}
