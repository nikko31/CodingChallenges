class Solution {
    public int solution(int[] A) {
        int l = A.length;
        double avg = 20002;
        double sum2 = 20002;
        double sum3 = 20002;
        int p = 0;
        for(int c = 0; c < l - 1; c++){
            sum2 = A[c]+A[c+1];
            if(avg > sum2/2){
                p = c;
                avg = sum2/ 2;
            }
            if(c+2<l){
                sum3 = (sum2 + A[c+2]);
                if(avg > (sum3 /3)){
                    avg = sum3 /3;
                    p = c;
                }
            }
        }
        return p;
    }
}
