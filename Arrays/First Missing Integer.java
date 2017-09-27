//problem can be found: https://www.interviewbit.com/problems/first-missing-integer/
public class Solution {
	public int firstMissingPositive(ArrayList<Integer> a) {
	    int missing=1;
	    Collections.sort(a);
	    for(int i=0;i<a.size();i++)
	    {  if(a.get(i)<=0) continue;
	        else if(a.get(i)!=missing)
	         return missing;
	         else missing++;
	    }
	    return missing;
	}
}
