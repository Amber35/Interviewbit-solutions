//problem can be found :https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/
public class Solution {
    
	public ArrayList<Integer> getRow(int a) {
    int C = 1;  // used to represent C(line, i)
    ArrayList<Integer> b=new ArrayList<Integer>();
    ++a;
    
    for (int i = 1; i <= a; i++)  
    {
        
        b.add(C);
       
        //System.out.println(C);
        // The first value in a line is always 1
      C = C * ((a) - i) / i;  
    }
    return b;
  }    
	
	


}
