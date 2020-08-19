package _03_字符串._125_验证回文串;

public class Solution {


    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        StringBuilder aimStrBuilder = new StringBuilder();
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                aimStrBuilder.append(ch);
            }
        }
        char[] str = aimStrBuilder.toString().toLowerCase().toCharArray();
        int left = 0;
        int right = str.length - 1;
        while (left <= right) {
            if (str[left] != str[right]) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
