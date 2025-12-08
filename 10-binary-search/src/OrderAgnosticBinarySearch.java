public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {-23, -21, -12, -9, 2, 6, 7, 12, 23, 34, 46, 59, 69, 77, 82, 99};
        int[] arr = {99, 82, 77, 69, 59, 46, 34, 23, 12, 7, 6, 2, -9, -12, -21, -23};
        int target = 99;
        int ans = orderAgnosticBinarySearch(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBinarySearch (int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //  Find whether array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
