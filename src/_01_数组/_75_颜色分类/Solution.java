package _01_数组._75_颜色分类;

public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
        sortColors(nums);
    }

    /**
     * 先遍历计算出每个颜色的个数，然后再重新填充数组
     * @param nums
     */
    public static void sortColors(int[] nums) {
        int redNum = 0;
        int whiteNum = 0;
        int blueNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                redNum ++;
            } else if(nums[i] == 1) {
                whiteNum ++;
            } else {
                blueNum ++;
            }
        }
        for (int i = 0; i < redNum; i++) {
            nums[i] = 0;
        }

        for (int i = 0; i < whiteNum; i++) {
            nums[redNum++] = 1;
        }
        for (int i = 0; i < blueNum; i++) {
            nums[redNum ++] = 2;
        }
    }
}
