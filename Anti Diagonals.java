//problem can be found :https://www.interviewbit.com/problems/anti-diagonals/
public class Solution {
	public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
	    ArrayList<ArrayList<Integer>> sol=new ArrayList<ArrayList<Integer>>();
	    int maxi;
	    if(a.size()<=1) return a;
	    if(a.size()==a.get(0).size())
	    maxi=2*a.size()-1;
	    else
	    { maxi=Math.max(a.size(),a.get(0).size());
	    ++maxi;
	    }
	    for(int i=0;i<maxi;i++)
	    sol.add(i,new ArrayList<Integer>());
	    for(int i=0;i<a.size();i++)
	    {
	        for(int j=0;j<a.get(i).size();j++)
	        {
	            sol.get(i+j).add(a.get(i).get(j));
	            
	        }
	        
	        
	    }
	    return sol;
	}
}
