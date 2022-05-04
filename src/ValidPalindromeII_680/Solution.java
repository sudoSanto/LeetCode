package ValidPalindromeII_680;

class Solution {
    public boolean validPalindrome(String s) {
        int x = s.length() - 1;
        for (int i = 0; i < x + 1; i++) {
            if (s.charAt(i) != s.charAt(x)) {
                if ((s.charAt(i + 1) == s.charAt(x)) || (s.charAt(i) == s.charAt(x - 1))) {
                    return (isPalindrome(s.substring(i + 1, x + 1))) || (isPalindrome(s.substring(i, x)));
                }
                return false;
            }
            x--;
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        int x = s.length() - 1;
        for (int i = 0; i < x; i++) {
            if (s.charAt(i) != s.charAt(x)) {
                return false;
            }
            x--;
        }
        return true;
    }
}