public class MaxNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println("Max value in an Array: " + max(arr));

        System.out.println("Max value within a range: " + maxRange(arr, 1, 3));
    }

    // If the Array is not empty
    static int max(int[] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }


    // Work on edge cases here, like array being null
    static int maxRange (int[] arr, int start, int end) {

//        if (end > start) {
//            return -1;
//        }

        if (arr == null) {
            return -1;
        }

        int maxValue = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        } return maxValue;
    }
}
