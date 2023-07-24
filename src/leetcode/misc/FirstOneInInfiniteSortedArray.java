package leetcode.misc;

public class FirstOneInInfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 1,1,1}; // ans = 6

        int low = 0;
        int high = 1;


            int res = binSearch(arr, low, high);
            while (res == -1) {
                low = high;
                high *= 2;
                res = binSearch(arr, low, high);
            }
            System.out.println(res);

    }

    static int binSearch(int[] arr, int low, int high) {

        int mid = (low + high) / 2;
        if (low > high)
            return -1;
        if (arr[mid] == 1) {
            if (mid == 0 || arr[mid - 1] == 0) {
                return mid;
            }
            high = mid;

        } else {
            low = mid + 1;

        }
        return binSearch(arr, low, high);
    }
}
