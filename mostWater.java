// class Solution {
//     public int maxArea(int[] height) {
//         int max=0,i=0,j=height.length,colhyt=0,waterlevel=0;
//         for(i=0;i<height.length;i++)
//         {
//             colhyt=0;
//             waterlevel=0;
//             for(j=i+1;j<height.length;j++)
//             {
//                 if(height[j]<height[i])
//                     colhyt=height[j];
//                 else
//                     colhyt=height[i];
//                 waterlevel=colhyt*(j-i);
//                 if(waterlevel>max)
//                     max=waterlevel;
//             }
//         }
//         return max;
//     }
// }
import java.lang.Math;
class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0, l=0, r = height.length-1;
        while(l<r)
        {
            maxarea = Math.max( maxarea, Math.min(height[l],height[r]) * (r-l) );
            if(height[l]<height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}
