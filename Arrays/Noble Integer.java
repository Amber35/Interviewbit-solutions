public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i=0;i<A.size()-1;i++)
        {
            if((int)A.get(i)==(int)A.get(i+1))
            continue;
            
            else if((int)A.get(i)==(A.size()-(i+1)))
            {
                return 1;
            }
            
        }
        if((int)A.get(A.size()-1)==0)
        return 1;
        else
        return -1;
    }
    
}
