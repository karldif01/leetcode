class Solution {
    public static int search_insert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                index = i;
                break;
            }
        }
        return index;
    }
}