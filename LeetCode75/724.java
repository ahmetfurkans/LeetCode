// https://leetcode.com/problems/find-pivot-index/submissions/

class Solution {
    public int pivotIndex(int[] nums) {
        int sumAll = 0;
        int sumL = 0;
        for (int i:nums) {
            sumAll += i;
        }

        for (int i = 0; i < nums.length; i++) {
                if (sumL == sumAll - sumL - nums[i]){
                    return i;
                }else{
                    sumL += nums[i];
                }
        }
        
        return -1;
    }
}