import java.util.Arrays;
import java.util.Stack;
class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        Stack<Integer> s = new Stack<>();
        for(int c = 0; c < A.length; c++){
            
            if(s.isEmpty())
                s.push(A[c]);
            else{
                Integer k = s.pop();
                if(k!= A[c]) return k.intValue();
            }
        }  
        return s.pop();
    }
}
