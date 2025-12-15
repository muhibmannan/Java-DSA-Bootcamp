import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 7, 8, 8, 10};
        int target = 9;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};

        ans[0] = binarySearch(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = binarySearch(arr, target, false);
        }
        return ans;
    }

    static int binarySearch(int[] arr, int target, boolean findFirstIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (findFirstIndex) {
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        } return ans;
    }
}
