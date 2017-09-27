//problem can be found -https://www.interviewbit.com/problems/max-sum-contiguous-subarray/
public class Solution {
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> a) {
	    int max_so_far=a.get(0),max_current=a.get(0);
for(int i=1;i<a.size();i++)
{

max_current=Math.max(max_current+a.get(i),a.get(i));
max_so_far=Math.max(max_current,max_so_far);

}
return max_so_far;
	}
}
