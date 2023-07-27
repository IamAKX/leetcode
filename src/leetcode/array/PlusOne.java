package leetcode.array;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9,9};
        int[] res = plusOne(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+"\t");

        }
    }

    private static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--)
        {
            if(digits[i] < 9) //if digit is less than 9 simply add 1
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; //else digit would be 0
        }
        int[] newNumber = new int [n+1]; // when all digits are 9, new array with +1 length required
        newNumber[0] = 1; //first digit will always be 1
        return newNumber;

    }
}
