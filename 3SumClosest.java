import java.lang.Math;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ret=0,tar1=0,left=0,right=0;
        int delta =Integer.MAX_VALUE;
        
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            for(left=i+1,right=nums.length-1;left<right;)
            {
                    int sum = nums[i]+nums[left]+nums[right];
                    if(sum == target)
                        return target;
                int d = Math.abs(sum-target);
                if(d<delta){
                     delta = d;
                    ret = sum;
                }
                if(sum>target)
                    right--;
                else
                    left++;
                   
            }
        }
        return ret;
    }
}
