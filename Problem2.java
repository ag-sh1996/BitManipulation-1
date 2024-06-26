class Solution {
    //TC: O(n)
    //SC: O(1)
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int num : nums){
            result ^= num;
        }
        return result;
    }
}
