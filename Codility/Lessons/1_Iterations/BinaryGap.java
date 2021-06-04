class Solution {
    public int solution(int N) {
        int res = 0, t =0;
        int k =1;
        char b = 0;
        for(int c = 0; c<31; c++){
            //k = k<<c;
            //System.out.println(c + " "+(N & k));
            if( (N >> c)%2 == 1){
                if(b==0){
                    b++;
                }
                else{
                    if(res<t) 
                        res=t;
                    t = 0;
                }
            }
            else{
                if(b>0)
                    t++;
            }
        }
        return res;
    }
}

