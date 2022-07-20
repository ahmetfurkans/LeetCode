// https://leetcode.com/problems/two-sum/

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int arr[] = new int[2];

        
        for(int i = 0; i < n; i++){
            for (int k = 0; k < n; k++){
                if( k != i && (nums[i] + nums[k] == target)){

                    arr[0] = i;
                    arr[1] = k;
                    return arr;
                }
            }

        }
        return arr;
    }
}
