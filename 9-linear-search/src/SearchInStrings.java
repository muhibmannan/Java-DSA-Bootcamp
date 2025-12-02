public class SearchInStrings {
    public static void main(String[] args) {
        
        String name = "Muhib";
        char target = 'h';

        boolean ans = search2(name, target);
        System.out.println(ans);
        
    }

    //  OPTION 1
    static boolean search(String str, char tar) {
        if (str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (tar == str.charAt(i)) {
                return true;
            }
        } return false;
    }

    //  OPTION 2
    static boolean search2(String str, char tar) {
        if (str.isEmpty()) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == tar) {
                return true;
            }
        } return false;
    }
}