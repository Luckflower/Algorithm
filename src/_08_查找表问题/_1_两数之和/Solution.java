package _08_查找表问题._1_两数之和;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 11, 15};
        int[] result = twoSum(nums, 9);
        System.out.println(result.length);
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)) {
                return new int[]{map.get(num), i};
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }


}
