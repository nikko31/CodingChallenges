class Solution {
    public int solution(int[] A) {
        int sum = 0, t = 0;
        int min = -1;
        for(int c = 1 ; c< A.length; c++) sum+=A[c];
        for(int c = 0; c<A.length -1; c++){
            if(c!=0)
                sum -= A[c];
            t+=A[c];
            if(Math.abs(sum - t) < min || min  <0) min = Math.abs(sum - t);
        }
        return min;
    }
}
