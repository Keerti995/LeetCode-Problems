class Solution {
    public int longestPalindrome(String s) {
        Set<String> hashset = new HashSet<String>();
        int total=0,count=0,alone=0;
        for(int i=0;i<s.length();i++)
        {
            if(!(hashset.contains(Character.toString(s.charAt(i)))))
            { char c =s.charAt(i);
              hashset.add(Character.toString(s.charAt(i)));
             count = 0;
              for(int j=i;j<s.length();j++)
              {
                  if(s.charAt(j)==c)
                      count++;                
              }
             if(count == 1)
                 alone = 1;
             if(count%2 == 0)
                total+=count;
             else{
                 if(alone == 0)
                     alone = 1;
                 total+= (count-1);
             }
            }
        }
        if(alone ==1)
            total += 1;
        return total;
    }
}
