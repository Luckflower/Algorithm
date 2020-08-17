package _01_数组._11_盛最多水的容器;

public class Solution {

    public static void main(String[] args) {
        int[] height = new int[] {1,8,6,2,5,4,8,3,7};
        int s = maxArea(height);
        System.out.println(s);
    }

    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;//代表容器的左右
        int width = 0;
        int realHeight = 0;
        int s = 0;//代表面积

        while (left <= right) {
            realHeight = Math.min(height[left], height[right]);
            width = right - left;
            if (realHeight * width > s) {
                s = realHeight * width;
            }

            if (height[left] <= height[right])  {
                left ++;
            } else {
                right --;
            }

        }
        return s;
    }

}
