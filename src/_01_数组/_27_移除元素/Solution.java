package _01_数组._27_移除元素;

public class Solution {
    public static void main(String[] args) {
        int[] nums =  new int[]{0,1,2,2,3,0,4,2};
        int length = removeElement(nums, 2);
        System.out.println(length);
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0){
            return 0;
        }
        int k = 0;
        for(int i = 0; i <nums.length; i++){
            System.out.println("I " + i);
            if (val != nums[i]){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
