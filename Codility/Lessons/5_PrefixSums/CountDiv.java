class Solution {
    public int solution(int A, int B, int K) {
        int r = (B/K)-(A/K);
        if(A%K == 0) r++;
        return r;
    }
}
