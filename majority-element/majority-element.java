class Solution {
    public int majorityElement(int[] nums) {
        int max_ele = 0;
        int count =0;
        for(int i=0;i<nums.length;i++) {
            if(count == 0) {
                max_ele=nums[i];
                count = 1;
            }
            else {
                if(nums[i]==max_ele) count++;
                else count--;
            }
        }
        
        
        count=0;
        for(int ele : nums) {
            if(ele == max_ele) count++;
        }
        return count >= nums.length/2 ? max_ele : -1;
    }
}