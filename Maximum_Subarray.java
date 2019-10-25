class Solution {
    public int maxSubArray(int[] nums) {
        int max=-9999;
        int[] arr = new int[nums.length+1];
        if(nums.length != 0)
            max = nums[0];
        
        for(int i=0;i<nums.length;i++)
            arr[i] = nums[i];
        for(int i=1;i<nums.length;i++)
        {
            arr[i] = (arr[i-1] + arr[i] > arr[i]) ? arr[i-1]+arr[i] : arr[i] ;
            if(arr[i] > max)
                max = arr[i];                
        }
        return max;
    }
}
