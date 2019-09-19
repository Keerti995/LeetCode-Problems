class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m,n,o;
        m= nums1.length;
        n= nums2.length;
        o=(m+n);
        int i=0, k=0, j=0;
       int[] sort = new int[o];
        double median;
        
       while(i<nums1.length && j<nums2.length )
       {
           if(nums1[i]<=nums2[j]){
                   sort[k++] = nums1[i];
               i++;}
           else if(nums1[i]>nums2[j]){
                   sort[k++] = nums2[j];
               j++;}
       }
        while(i<nums1.length){
             sort[k++] = nums1[i];
               i++;
        }
         while(j<nums2.length){
             sort[k++] = nums2[j];
               j++;
        }
        k--;
        if(k%2 != 0)
        {
            median = (sort[((k/2)+1)] +  sort[(k/2)])  ;
            median = median/2.0;
            return( median );
        }
        median = sort[(k/2)];
        return( median );
    }
}
