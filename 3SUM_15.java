class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int max=-9999;
        Set<Integer> a = new HashSet<Integer>(); 
        
        if(nums.length<3)
            return list;
                            Arrays.sort(nums);
                            /*QuickSort(nums,0,nums.length-1);
                            */for(int i=0;i<nums.length;i++){
                                System.out.print(nums[i]);}
                                /*if(max<nums[i])
                                    max=nums[i];
                            }*/

        for(int i=0;i<nums.length;i++)
        {
            if(a.contains(nums[i]))
                continue;
            a.add(nums[i]);
            int rest = -nums[i];
            int m=i+1;
            Set<Integer> smalla = new HashSet<Integer>();
            while(m<nums.length )
            {   
                if(smalla.contains(nums[m]))
                {  m++;continue;}
                
                for(int j=m+1;j<nums.length;j++)
                {    
                   if(nums[m]+nums[j] == rest){
                       System.out.print("nums[i]"+nums[i]+" rest: "+rest+" m" +m+" nums[m]: "+nums[m]+" j: "+j+" nums[j]: "+nums[j]);
                  System.out.println("");
                        List<Integer> smalllist = new ArrayList<Integer>();
                        smalllist.add(nums[i]);
                        smalllist.add(nums[m]);
                        smalllist.add(nums[j]);
                        list.add(smalllist);
                         smalla.add(nums[m]);smalla.add(nums[j]);break;
                        }
                }
                m++;
            }
            
        }
       return list; 
    }
}
