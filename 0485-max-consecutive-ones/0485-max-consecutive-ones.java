class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        int N = nums.length;

        for(int i=0; i<N; i++){
            if(nums[i] == 0){
                max = Math.max(max, count);
                count = 0;
            } else {
                count++;
            }
        }
        max = Math.max(max, count);

        return max;
    }
}