import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        if(A.length == 0) return 1;
        Arrays.sort(A);
        for(int c =A[0]; c<A[0]+A.length;c++){
            if(c!=A[c-A[0]]) return c;
        }
        if(A[0] > 1) return A[0]-1;
        return A[A.length-1] + 1;
    }
}
