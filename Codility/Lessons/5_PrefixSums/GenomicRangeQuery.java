import java.util.ArrayList;
class Solution {
    int binarySearch(ArrayList<Integer> arr, int l, int r, int p, int q)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
            //System.out.println(arr.toString());
            // If the element is present at the 
            // middle itself
            if (arr.get(mid) >= p && arr.get(mid) <= q){
                //System.out.println(arr.toString());
                return mid;
            }
               
   
            // If element is smaller than mid, then 
            // it can only be present in left subarray
            if (arr.get(mid) > q)
               return binarySearch(arr, l, mid-1, p,q);
   
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid+1, r, p,q);
        }
   
        // We reach here when element is not present
        //  in array
        return -1;
    }

    public int[] solution(String S, int[] P, int[] Q) {
        int []res = new int[P.length];
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> C = new ArrayList<Integer>();
        ArrayList<Integer> G = new ArrayList<Integer>();
        for(int c = 0;c<S.length();c++){
            switch(S.charAt(c)){
                case 'A':
                    A.add(c);
                    break;
                case 'C':
                    C.add(c);
                    break;
                case 'G':
                    G.add(c);
                    break;
            }
        }
        for(int c = 0;c<P.length;c++){
            //for(int c1=0;c1<A.size() && f == false;c1++){
                if(A.size()>0 && binarySearch(A, 0, A.size()-1, P[c], Q[c])>=0)
                    res[c] = 1;
                else{
                    if(C.size()>0 && binarySearch(C, 0, C.size()-1, P[c], Q[c])>=0)
                    res[c] = 2;
                    else{
                        if(G.size()>0 && binarySearch(G, 0, G.size()-1, P[c], Q[c])>=0)
                    res[c] = 3;
                        else
                            res[c] = 4;
                    }
                }
            //}
        }
        return res;
    }
}
