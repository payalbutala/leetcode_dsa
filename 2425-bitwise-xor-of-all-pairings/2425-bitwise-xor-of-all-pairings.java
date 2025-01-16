class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int ans = 0;

        // If both arrays are of even length return 0
        if(len1 %2 == 0 && len2 %2 == 0){
            return 0;
        }

        // If both arrays are of odd length return its elements XOR
        if(len1%2 != 0 && len2%2 != 0){
            for(int i=0; i<len1; i++){
                ans = ans ^ nums1[i];
            }

            for(int i=0; i<len2; i++){
                ans = ans ^ nums2[i];
            }
            return ans;
        }

        // If any one of array is of odd and another array is of even length return XOR of even array length elements
        if(len1%2 == 0) {
            for(int i=0; i<len1; i++){
                ans = ans ^ nums1[i];
            }
            return ans;
        }

        if(len2%2 == 0) {
            for(int i=0; i<len2; i++){
                ans = ans ^ nums2[i];
            }
            return ans;
        }

        return 0;
    }
}
/*
num1 : 1 2 5 : 3
num2 : 3 4 : 2 

[
    1,3
    1,4
    2,3
    2,4
    5,3
    5,4
]



 */