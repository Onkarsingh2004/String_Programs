public class PalindromString {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        int len = str.length();

        // reverse the string manually
        for (int i = len - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        boolean isPalindrome = true;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != rev.charAt(i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}

