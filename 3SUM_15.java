class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(nums.length<3)
            return list;
        QuickSort(nums,0,nums.length-1);
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                continue;
            get3sum(nums,i,list);
        }
       return list; 
    }
    void get3sum(int[] nums, int i, List<List<Integer>> list)
    {
        if(i+1 >= nums.length)
            return ;
        int target = -nums[i], left = i+1, right = nums.length - 1;
        while(left<right)
        {
            if((nums[left]+nums[right])<target)
                left++;
            else if((nums[left]+nums[right])>target)
                right--;
            else
            {
                list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                while(left<right && nums[left]==nums[left+1])
                    left++;
                while(left<right && nums[right]==nums[right-1])
                    right--;
                left++;
                right--;
            }
        }
    }
    void QuickSort(int[] nums, int low, int high)
    {
        if(low<high)
        {
           int pi = partition(nums,low,high);
            QuickSort(nums,low,pi-1);
            QuickSort(nums,pi+1,high);
        }
    }
    int partition(int[] nums, int low, int high)
    {
        int i=low-1;
        int pivot=nums[high];
        for(int j=low;j<high;j++)
        {
            if(nums[j]<pivot)
            { 
                i++;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        
        nums[high]=nums[i+1];
        nums[i+1]=pivot;
        //System.out.println();
        //System.out.println("Low: "+low+" high: "+high+" i: "+(i+1));
       // for(int j=low;j<=high;j++)
         //   System.out.print(nums[j]);
        return i+1;
    }
}
