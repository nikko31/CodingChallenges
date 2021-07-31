class Solution {
    public int solution(int[] A) {
        int l = A.length;
        long res = 0;
        int t = 0;
        for(int c = l -1; c >= 0;c--){
            if(A[c] == 1)
                t++;
            else{
                if(A[c]== 0)
                    res += t;
                    if(res > 1000000000) return -1;
            }
        }
        return (int)res;
    }
}
