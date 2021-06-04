import java.util.Arrays;

class Solution {
    public int solution(int X, int[] A) {
        int []b= new int[X+1];
        Arrays.fill(b, -1);
        int e = X;
        int c = 0;
        for(; c < A.length ;c++){
            if(b[A[c]] == -1){
                //System.out.println(A[c] + " "+c);
                b[A[c]] = c;
                e--;
                if(e == 0) return c;
            }
        }
        return   -1;
    }
}
