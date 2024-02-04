package Array;

public class A_704_BinarySearch {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(true) {
            if(left > right) {
                return -1;
            }
            if(right == left) {
                return nums[left] == target ? left : -1;
            }

            int mid = (right + left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12, 14};
        int target = 9;

        System.out.println(search(nums, target));

        target = 2;
        System.out.println(search(nums, target));
    }
}
