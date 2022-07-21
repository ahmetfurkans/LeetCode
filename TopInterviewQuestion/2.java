https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/class Solution {

    static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> mergedArr = new ArrayList<Integer>();
        int n = nums1.length;
        int m = nums2.length;

        for (int i = 0; i < n; i++) {
            mergedArr.add(nums1[i]);
        }
        for (int i = 0; i < m ; i++) {
            mergedArr.add(nums2[i]);
        }

        Collections.sort(mergedArr);
        System.out.println(mergedArr);
        if((m+n)%2==0){
            int median = mergedArr.get((m + n)/2) + mergedArr.get(((m + n)/2) - 1);
            return median / 2.;
        }else{
            return (double) mergedArr.get(((m+n)/2));
        }
    }
}