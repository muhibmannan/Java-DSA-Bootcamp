public class RotatedBinarySearch {
    public static void main(String[] args) {
//        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int[] nums = {3, 9, 2, 2, 2, 3, 3};
        int target = 2;

        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);

        // If no pivot was found, array is not rotated.

        if (pivot == -1) {
            // Just perform normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        // If Pivot was found, we have found two ascending sorted arrays

        // ---3 CASES TO FIND THE ANSWER USING PIVOT---
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {

            //  Find the middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // ---4 CASES TO FIND THE PIVOT---
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // ---4 CASES TO FIND THE PIVOT---
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // If elements at middle, start and end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {

                // Skip the duplicates

                // NOTE: What if these elements at start and end were the pivot??
                // Check if Start is Pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // Check if End is Pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // Left side is sorted, so Pivot should be on the right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
