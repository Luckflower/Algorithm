package _02_查找._01_二分查找;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{2,4,6,8,9,10,13,19,20,30};
        int result = binarySearch(array, 6);
        System.out.println("result = "+result);
    }

    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int middle;

        while(left <= right){
            middle = (left + right) / 2;
            if (target == array[middle]){
                return middle;
            }
            if (target < array[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }
}
