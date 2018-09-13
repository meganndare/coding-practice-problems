class Solution {
    public int removeDuplicates(int[] nums) {
        
        if (nums.length < 1) return 0;
        int currentVal = -1;
        if (nums[0] == -1) currentVal = -2;     
        int length = 0;
        
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != currentVal) {
                currentVal = nums[i];
                nums[length] = currentVal;
                length++;
            } 
        }
        
        return length;
    }
}