//  https://leetcode.com/problems/find-in-mountain-array/description/

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] mountainArr = {1, 2, 3, 4, 5, 3, 1};
        int target = 6;

        System.out.println(search(mountainArr, target));
    }

    static int search(int[] mountainArr, int target) {
        int peak = peakIndexInMountainArray(mountainArr);

        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak);
        if (firstTry != 0) {
            return firstTry;
        }
        return orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length - 1);
    }

    static int peakIndexInMountainArray(int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArr[mid] > mountainArr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int orderAgnosticBS(int[] mountainArr, int target, int start, int end) {
        boolean isAsc = mountainArr[start] < mountainArr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mountainArr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < mountainArr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < mountainArr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
