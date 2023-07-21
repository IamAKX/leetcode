package leetcode.array;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {8,9};
        int[] res = plusOne(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+"\t");

        }
    }

    private static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        return newNumber;

    }
}
