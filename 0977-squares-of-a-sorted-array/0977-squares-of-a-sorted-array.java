class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int N = nums.length;
        int right = N-1;
        int k = N-1;
        int num1 = nums[0];
        int num2 = nums[N-1]; 
        int[] ans = new int[N];

        if(N==1){
            nums[0] = num1*num1;
            return nums;
        }

        for(int i=0; i<N; i++){
            if(nums[i] < 0){
                nums[i] = (-1)*nums[i];
            }
        }

        while(left <= right){
            num1 = nums[left];
            num2 = nums[right];

            if(num2 > num1){
                ans[k] = num2*num2;
                right--;
            } else {
                ans[k] = num1*num1;
                left++;
            }
            k--;
        }

        return ans;
    }
}