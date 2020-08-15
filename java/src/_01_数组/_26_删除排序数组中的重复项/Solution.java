package _01_数组._26_删除排序数组中的重复项;

public class Solution {
    public static void main(String[] args) {
//        int[] nums =  new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] nums =  new int[]{1,1,1,2,2,3};
        int length = removeDuplicates(nums);
        System.out.println(length);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int k = 0;
        for(int i = 1; i<nums.length; i++){
            if (nums[k] != nums[i]) {
                nums[++k] = nums[i];
            }
        }
        return k+1;
    }
}
