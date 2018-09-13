class Solution {
    public int maxArea(int[] height) {
        
        int currentHighest = 0;
        int area = 0;
        int shortest = 0;
             
        for (int i = 0; i < height.length; i++) {
                  
            for (int j = height.length - 1 ; j > i; j--) {
                
                if (height[i] <= height[j]) {
                    shortest = height[i];
                } else if (height[j] < height[i]) {
                    shortest = height[j];
                }
                
                area = (j - i) * shortest;
                
                if (area > currentHighest) currentHighest = area;
                
            }
        }
        
        return currentHighest;
    }
}