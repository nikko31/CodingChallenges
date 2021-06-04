import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        for(int c = 0 ; c<A.length; c++){
            if(c+1 !=A[c]) return 0;
        }
        return 1;
    }
}
