public class InfiniteArrayPositionSearch {
    public static void main(String[] args) {
        //  Imagine the below is an infinite array
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,21,22,23,24,25,26,27,28,29,30,31,32,33,34};
        int target = 28;

        System.out.println(binaryRange(arr, target));
    }

    static int binaryRange(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while(target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
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

}
