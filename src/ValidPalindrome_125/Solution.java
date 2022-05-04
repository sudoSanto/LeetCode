package ValidPalindrome_125;

public class Solution {
    public boolean isPalindrome(String s) {
        s = formatString(s).toLowerCase();
        int x = s.length() - 1;
        for (int i = 0; i < x; i++) {
            if (s.charAt(i) != s.charAt(x)) {
                return false;
            }
            x--;
        }
        return true;
    }

    private String formatString(String s) {
        return s.replaceAll("[^A-Za-z0-9]", "");
    }
}
