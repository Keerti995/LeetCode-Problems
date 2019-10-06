class Solution {
    public int rob(int[] nums) {
        int F[] = new int[nums.length];
        if(nums.length==1)
            return nums[0];
        if(nums.length<1)
            return 0;
        F[0] = nums[0];
        F[1] = Math.max(nums[0],nums[1]);
        int max = Math.max(F[0],F[1]); 
        for(int i = 2; i<nums.length;i++)
        { F[i] = Math.max(nums[i]+F[i-2] , F[i-1]);
         if(max<F[i])
             max = F[i];
    }
    return max;}
}
