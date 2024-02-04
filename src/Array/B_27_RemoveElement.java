package Array;

public class B_27_RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        int k = 0;

        while (left <= right) {
            if(nums[left] == val) {
                nums[left] = nums[right];
                nums[right] = -1;
                right --;
            } else {
                left ++;
                k ++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;

        assert 2 == removeElement(nums, val);

        nums = new int[]{0,1,2,2,3,0,4,2};
        val = 2;
        assert 5 == removeElement(nums, val);

        nums = new int[]{};
        val = 2;
        assert 0 == removeElement(nums, val);
    }
}
