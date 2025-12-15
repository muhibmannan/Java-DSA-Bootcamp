//  https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class NextGreatestCharacter {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j', 'y'};
        char target = 'j';

        System.out.println(nextGreatestCharacter(letters, target));
    }

    static char nextGreatestCharacter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

//            if (target < letters[mid]) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }

            if (target > letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }
}
