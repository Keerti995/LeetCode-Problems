class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list1 = new ArrayList<>();
        Arrays.sort(nums);
        int tar1=0,tar2=0,tar3=0;
        int left =0, right=0;
        for(int i=0;i<nums.length-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            tar1 = target - nums[i];                //4th no
            for(int j=i+1;j<nums.length-2;j++)
            {
                 if(j>(i+1) && nums[j]==nums[j-1])
                     continue;
                tar2 = tar1 - nums[j];              //3rd no
                left = j+1; right = nums.length-1;
                while(left<right)
                {
                    tar3 = tar2 - nums[left];
                    if(tar3 == nums[right])
                    {
                        list1.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                        while(left<right && nums[left]==nums[left-1])
                            left++;
                        while(left<right && nums[right] == nums[right+1])
                            right--;
                    }
                    else if(tar3>nums[right])
                        left++;
                    else
                        right--;
                }
            }
        }
        return list1;
    }
}
