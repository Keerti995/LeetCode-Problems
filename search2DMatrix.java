class Solution {
    int above=0, below=0;
    public boolean searchMatrix(int[][] matrix, int target) {
        int row =0;
        
        if(matrix.length == 0)
           return false;
        else
        {
            if(matrix.length == 1)
                row = 0;
            else
              row = (matrix.length/2)-1;  
        }
            
        if(find(matrix,target,row))
            return true;
  
         return false;
        
    }
    public boolean find(int[][]matrix, int target, int row)
    {
        int col = 0;
       
        if(matrix[row].length == 0)
           return false;
        else
        {
            col = (matrix[row].length)-1;  
        }
         if(matrix[row][0] == target)
             return true;
        else if(matrix[row][col] == target)
            return true;
        else if(matrix[row][0] < target && target < matrix[row][col])
        {
            for(int i=0;i<=col;i++)
            {
                if(matrix[row][i] == target)
                    return true;
            }
                return false;
        }
        else if(target < matrix[row][0] )
        {
            if(below == 0)
                below = 1;
            if(above == 1 )
                return false;
            if(row>0)
                return( find(matrix,target,row-1) );
            else
                return false;
        }
         else if(target > matrix[row][0] )
        {   
             if(above == 0)
                 above =1;
             if(below == 1)
                 return false;
            if(row < matrix.length-1)
                return( find(matrix,target,row+1) );
            else
                return false;
        }
            
    return false;             
    }
}
