package _01_数组._283_零移动;

class Solution {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        print(nums);
    }

    //方法一：原地交换位置，空间复杂度为O1， 针对每一个元素做交换，如果当前元素是0，则将当前元素和后一个交换
    // public void moveZeroes(int[] nums) {
    //     int temp;

    //     for (int i = 0; i < nums.length ; i++) {
    //         for (int j = 0; j < nums.length ; j++) {
    //             if (nums[j] == 0 && j < nums.length - 1) {
    //                 temp = nums[j+1];
    //                 nums[j+1] = nums[j];
    //                 nums[j] = temp;
    //             }
    //         }
    //     }
    // }

    // //方法二：空间复杂度为On
    // public static void moveZeroes(int[] nums) {
    //     List<Integer> nonZeroElements = new ArrayList<Integer>();

    //     for (int i = 0; i < nums.length ; i++) {
    //         if (nums[i] != 0) {
    //             nonZeroElements.add(nums[i]);
    //         }
    //     }

    //     for (int j = 0 ; j < nonZeroElements.size() ; j++) {
    //         nums[j] = nonZeroElements.get(j);
    //     }

    //     for (int k = nonZeroElements.size() ; k < nums.length ; k++) {
    //         nums[k] = 0;
    //     }
    // }

    //方法三：原地移动，直接将非0元素一个个的放在前面，然后再填补0
    //时间复杂度为On
    //空间复杂度为O1
    public static void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        for (int i = k; i < nums.length ; i++) {
            nums[i] = 0;
        }
    }

    private static void print(int[] nums) {
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(nums[i]);
        }
    }
}
