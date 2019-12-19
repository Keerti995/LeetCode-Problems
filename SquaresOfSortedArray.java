import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        int l = 0;
        int r = A.length - 1;
        for (int i = result.length-1; i >= 0; --i) {
            int sqrL = A[l] * A[l];
            int sqrR = A[r] * A[r];
            if (sqrL > sqrR) {
                result[i] = sqrL;
                ++l;
            } else {
                result[i] = sqrR;
                --r;
            }
        }
        return result;
    }
}
