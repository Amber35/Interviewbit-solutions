// problem can found here :https://www.interviewbit.com/problems/min-steps-in-infinite-grid/
public class Solution {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int i=0,j=0,xcost,ycost,cost=0;
        while(X.size()>i+1 && Y.size()>j+1)
        {
           xcost=Math.abs(X.get(i)-X.get(i+1));
            ycost=Math.abs(Y.get(j)-Y.get(j+1));
           // System.out.println("x "+xcost); taking minimum for both axis
            //System.out.println("y "+ycost);
            i++;j++;
          cost=cost+Math.max(xcost,ycost);
            
        }
        return cost;
    }
}
