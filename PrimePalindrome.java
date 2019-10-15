class Solution {
    public int primePalindrome(int N) {
       
        if(8<= N && N<=11)
            return 11;
        else{
            for(int i=1;i<=100000;i++)
            {
                String str1 = Integer.toString(i);
                StringBuffer s = new StringBuffer(str1);
                s.reverse();
                
                int y = Integer.parseInt(str1+s.substring(1).toString());
                
                if(y >= N && prime(y)==true)
                    return y;                
            }
        }
                    
        return -1;
    }
    public boolean prime(int y)
    {
        if(y<2 || (y%2) == 0)
            return y==2;
        
            for(int i=3;i*i <= y; i++)
            {
                if(y%i == 0)
                    return false;
            }
            return true;
    }
}
