class Solution {
    public int[] sortedSquares(int[] nums) {
       int i,l=nums.length;
        for(i=0;i<l;i++){
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
     return nums;}
}