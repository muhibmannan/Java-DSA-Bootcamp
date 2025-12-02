
public class Main {

    public static void main(String[] args) {
        int[] nums = {12, 44, 53, -23, 65, 2, -5, 467, 14, 76, 10, -73};
        int targetIndexNumFor = -23;

        int ansIndex = linearSearchIndex(nums, targetIndexNumFor);
        System.out.println(ansIndex);

        int targetElement = 65;
        int ansElement = linearSearchElement(nums, targetElement);
        System.out.println(ansElement);

        int targetBoolean = 2;
        boolean ansBoolean = linearSearchBoolean(nums, targetBoolean);
        System.out.println(ansBoolean);

    }


    //                  FINDING THE INDEX
    //  search in the array: return the index if item found
    //  otherwise return -1
    static int linearSearchIndex(int[] arr, int tar) {
        if (arr.length == 0) {
            return -1;
        }

        //  run a for loop
        for (int i = 0; i < arr.length; i++) {
            //  check for element at every index if it is = target
            int element = arr[i];
            if (element == tar){
                return i;
            }
        }
        /*
        following line will execute if none of the return statements above have executed
        hence the target is not found
         */
        return -1;
    }


    //                  FINDING THE ELEMENT
    //  search in the array: return the index if item found
    //  otherwise return -1
    static int linearSearchElement(int[] arr, int tar) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        //  run a for loop
        for (int element : arr) {
            //  check for element at every index if it is = target
            if (element == tar) {
                return element;
            }
        }
        /*
        following line will execute if none of the return statements above have executed
        hence the target is not found
         */
        return Integer.MAX_VALUE;
    }


    //                  FINDING THE ELEMENT
    //  search in the array: return the index if item found
    //  otherwise return -1
    static boolean linearSearchBoolean(int[] arr, int tar) {
        if (arr.length == 0) {
            return false;
        }

        //  run a for loop
        for (int element : arr) {
            //  check for element at every index if it is = target
            if (element == tar) {
                return true;
            }
        }
        /*
        following line will execute if none of the return statements above have executed
        hence the target is not found
         */
        return false;
    }
}