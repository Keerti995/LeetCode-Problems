class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length < 2)
            return  new int[] {0,0};
        int lp=0,rp=numbers.length-1;
        while(lp<rp)
        {
            if(numbers[lp]+numbers[rp]==target)
                return new int[] {lp+1, rp+1};
            else if(numbers[rp]>(target-numbers[lp]))
                rp--;
            else
                lp++;
        }
        return new int[] {0,0};
    }
}
