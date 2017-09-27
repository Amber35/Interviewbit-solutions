\\problem can be found :https://www.interviewbit.com/problems/pascal-triangle/
public class Solution {
	public ArrayList<ArrayList<Integer>> generate(int a) {
	 ArrayList<ArrayList<Integer>> b=new ArrayList<ArrayList<Integer>>();
	 int p1; ++a; int C,p;
	 ArrayList<Integer>ab;
	for( p=0;p<a-1;p++)
	{ C=1;
	p1=p+1;
	ab=new ArrayList<Integer>();
    for (int i = 1; i <= p1; i++)  
    {
        
        ab.add(C);
       
        //System.out.println(C);
        // The first value in a line is always 1
      C = C * ((p1) - i) / i;  
    }
    b.add(ab);
	}
	    return b;
	}
}
