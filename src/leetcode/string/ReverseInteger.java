package leetcode.string;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = -123;
        int y = reverse(x);
        System.out.println(y);
    }

    private static int reverse(int x) {
        boolean isNegative = x < 0;
        x = Math.abs(x);
        long res = 0;
        while (x > 0) {
            res = res * 10 + x % 10;
            x = x / 10;

        }
        if(res > Integer.MAX_VALUE)
            return 0;
        if (isNegative)
            res *= -1;
        return (int)res;

    }
}
