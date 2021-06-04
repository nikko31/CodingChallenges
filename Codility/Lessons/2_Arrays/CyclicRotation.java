class Solution {
    public int[] solution(int[] A, int K) {
        int l = A.length;
        int [] t = new int[l];
        for(int c = 0; c<l; c++){
            t[(c+K)%l] = A[c];
        }
        return t;
    }
}
