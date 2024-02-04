package Array;

import java.util.Arrays;

public class C_977_SquaresOfASortedArray {

    public static int[] SortedSquares(int[] nums) {
        int index = nums.length - 1;
        for(int i = 0; i< nums.length; i++) {
            if(nums[i] >= 0) {
                index = i;
                break;
            }
        }

        int[] result = new int[nums.length];
        int left = index - 1;
        int right = index;
        int i = 0;
        while (left >= 0 && right < nums.length) {
            if (Math.abs(nums[left]) <= nums[right]) {
               result[i] = nums[left] * nums[left];
               left --;
            } else {
                result[i] = nums[right] * nums[right];
                right ++;
            }
            i ++;
        }

        while (left >= 0) {
            result[i] = nums[left] * nums[left];
            left --;
            i ++;
        }
        while (right < nums.length) {
            result[i] = nums[right] * nums[right];
            right ++;
            i ++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-4,-1,0,3,10};
        assert Arrays.equals(new int[]{0,1,9,16,100}, SortedSquares(nums));

        nums = new int[]{-7,-3,2,3,11};
        assert Arrays.equals(new int[]{4,9,9,49,121}, SortedSquares(nums));

        nums = new int[]{-5,-3,-2,-1};
        assert Arrays.equals(new int[]{1,4,9,25}, SortedSquares(nums));
    }
}
