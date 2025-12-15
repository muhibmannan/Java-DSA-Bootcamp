public class floorOfNumber {
    public static void main(String[] args) {

        int[] arr = {-23, -21, -12, -9, 2, 6, 7, 12, 23, 34, 46, 59, 69, 77, 82, 99};
        int target = 3;
        int ans = floorOfNumber(arr, target);
        System.out.println(ans);
    }

    static int floorOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
        return end;
    }
}
