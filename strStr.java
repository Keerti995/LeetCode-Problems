//Implementation of strStr function where in it detects the first occurrence of given substring
class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.length()==0)
            return 0;
        else
        {
            int needle_len = needle.length();
            for(int i=0;i<=haystack.length()-needle_len;i++)
            {
                if(needle.equals(haystack.substring(i,(needle_len+i) ) ) )
                    return i;
            }
        }
        return -1;
    }
}
