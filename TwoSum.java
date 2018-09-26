class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> integers = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (integers.containsKey(target - nums[i])) {
                int[] result = new int[2];
                result[0] = integers.get(target - nums[i]);
                result[1] = i;
                return result;
            } else {
                integers.put(nums[i], i);
            }
        }
        
        return null;
    }
}