public class SearchInRange {
    public static void main(String[] args) {

        int[] arr = {12, 43, 67, 8, -11, 20};
        int target = 8;

        System.out.println(searchIndexInRange(arr, target, 1, 4));
    }

    static int searchIndexInRange(int[] arr, int tar, int start, int end) {

        //  Safety check: To make sure array is not empty
        if (arr.length == 0) {
            return -1;
        }

        //  Safety check: Are start and end valid indices?
        if (start < 0 || end >= arr.length) {
            return -2;
        }

        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == tar){
                return i;
            }
        } return -1;
    }
}
