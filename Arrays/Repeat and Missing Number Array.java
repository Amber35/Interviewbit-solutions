//problem can be found : https://www.interviewbit.com/problems/repeat-and-missing-number-array/
public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
	    ArrayList<Integer> res = new ArrayList<>();
	    
	    Collections.sort(a);
	    int n = a.size();
	    int rep = -1;
	    int miss = -1;
	    long sum = a.get(0);
	    
	    for (int i = 1; i < n; i++) {
	        if (a.get(i).intValue() == a.get(i - 1).intValue()) {
	            rep = a.get(i);
	        }
            sum += a.get(i);
	    }
	    
	    miss = (int) ((1L * n * (1L * n + 1)) / 2 - sum + rep);
	    
	    res.add(rep);
	    res.add(miss);
	    
	    return res;	}
}
