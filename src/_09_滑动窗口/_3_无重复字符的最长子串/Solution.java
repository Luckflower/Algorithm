package _09_滑动窗口._3_无重复字符的最长子串;

public class Solution {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int length = lengthOfLongestSubstring(s);
        System.out.println(length);

    }

    public static int lengthOfLongestSubstring(String s) {
        int firstPos = 0;
        int i = 1;
        int length = 0;
        int result = 0;
        while(i < s.length()) {
            int pos = s.indexOf(s.charAt(i), firstPos);
            if (pos < i) {//小于i表示找到了并且位置在i之前，
                if (length > result) {
                    result = length;
                }
                if (result > s.length() - pos -1) {
                    return result;
                }
                firstPos ++;
                length = i - pos - 1;
            }
            length ++;
            i ++;
        }
        return length;
    }
}
