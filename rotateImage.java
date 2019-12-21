class Solution {
    public void rotate(int[][] matrix) {
      
         int fp=0,lp=matrix.length-1;
        
        while(fp<lp)
        {
            int col = matrix[fp].length - 1;
            while(col>=0)
            {
                int temp = matrix[fp][col];
                matrix[fp][col] = matrix[lp][col];
                matrix[lp][col] = temp;
                col--;
            }
            fp++;
            lp--;
        }    
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix[i].length;j++){
                int temp =matrix[i][j] ;
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
