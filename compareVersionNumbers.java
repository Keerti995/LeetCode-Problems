class Solution {
    public int compareVersion(String version1, String version2) {
        String[] str = version1.split("[.]");
        String[] str2 = version2.split("[.]");
        //System.out.println(version2+" "+Arrays.toString(str2));
        int flag = Integer.MIN_VALUE,i=0,str_length = str.length,str2_length = str2.length;
        while(flag == Integer.MIN_VALUE && str_length>0 && str2_length>0 && i<4)
        {
           if(Integer.parseInt(str[i]) < Integer.parseInt(str2[i]))
               flag = -1;
            else if (Integer.parseInt(str[i]) > Integer.parseInt(str2[i]))
                flag = 1;
            str_length--;
            str2_length--;
            i++;            
        }
        while(flag == Integer.MIN_VALUE && str_length>0 && i<4)
        {
           if(Integer.parseInt(str[i])!=0)
               flag = 1;
            str_length--;
            i++;
        } 
          while(flag == Integer.MIN_VALUE && str2_length>0 && i<4)
        {
           if(Integer.parseInt(str2[i])!=0)
               flag = -1;
            str2_length--;
            i++;
        }  
        return flag == Integer.MIN_VALUE ? 0 : flag ;
    }
}
